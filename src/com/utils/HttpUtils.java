package com.utils;

import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class HttpUtils {
	static HttpClient httpClient = null;
	
	static {
		BasicHttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, 1000 * 1000);
		HttpConnectionParams.setSoTimeout(httpParams, 1000 * 1000);

		PoolingClientConnectionManager pcm = new PoolingClientConnectionManager();
		pcm.setMaxTotal(20000);
		pcm.setDefaultMaxPerRoute(pcm.getMaxTotal());
		httpClient = new DefaultHttpClient(pcm, httpParams);
	}
	
	
	public JSONObject  JsonHttpPost(String  body, String url,Map<String,String> headMap) {
		 HttpGet method = new HttpGet(url);  
		 if(headMap!=null){
	    		for (String key : headMap.keySet()) {
	    			method.addHeader(key, headMap.get(key)); 
	     		 
	    		}
	    	}
		StringEntity entity = null;
		try {
			entity = new StringEntity(body,"utf-8");
			//解决中文乱码问题    
	        entity.setContentEncoding("UTF-8");    
	        entity.setContentType("application/json");    
	        //method.setEntity(entity);  
	        HttpResponse loginHttpResponse = httpClient.execute(method);
			int code = loginHttpResponse.getStatusLine().getStatusCode();
			String xmlContent = null;
			if (code == 200) {
				HttpEntity httpEntity = loginHttpResponse.getEntity();
				xmlContent = EntityUtils.toString(httpEntity);
				System.out.println(xmlContent);
			}
			method.releaseConnection();
			if(xmlContent!=null){
				return JSONObject.fromObject(xmlContent);
			}
			else{
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	} 
	
	public static void main(String[] args) throws Exception {
		
		String url = "http://121.14.43.70:25128/argo_iap/SyncAppOrderReq";
		String entity = "{\"MSISDN\":\"\",\"actionID\":1,\"actionTime\":\"20151208102653\",\"appID\":\"300008928532\",\"channelID\":\"2200125968\",\"checkID\":0,\"exData\":\"1449541605\",\"feeMSISDN\":\"E1C674CBAB2CCF8D\",\"msgType\":\"SyncAppOrderReq\",\"orderID\":\"11151208102653273528\",\"payCode\":\"30000892853210\",\"price\":2000,\"programID\":\"\",\"subsNumb\":1,\"subsSeq\":1,\"totalPrice\":2000,\"tradeID\":\"4EBF5007D6\",\"transactionID\":\"CSSP12816315\",\"version\":\"1.0.0\"}";
		HttpPost httppost = new HttpPost(url);  
	   // httppost.addHeader("Authorization", "your token"); //认证token  
	    httppost.addHeader("Content-Type", "application/json");  
	    //httppost.addHeader("User-Agent", "imgfornote");  
	    //http post的json数据格式：  {"name": "your name","parentId": "id_of_parent"}  
	    httppost.setEntity(new StringEntity(entity)); 
	    HttpResponse loginHttpResponse = httpClient.execute(httppost);
		int code = loginHttpResponse.getStatusLine().getStatusCode();
		String xmlContent = null;
		if (code == 200) {
			HttpEntity httpEntity = loginHttpResponse.getEntity();
			xmlContent = EntityUtils.toString(httpEntity);
			System.out.println(xmlContent);
		}
		httppost.releaseConnection();
		
	}
}
