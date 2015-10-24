package com.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

import com.utils.test.Test1;

import net.sf.json.JSONArray;
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
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		/*[
	      {
	         "appAccountId": "123",                 
	        "businessId":"222",
	        "profileName": "spring assessment",
	        "assessmentCd": "AD11",
	        "creationTime": "2015-06-01 00:00:00",
	        "orderTime":"2015-06-01 00:00:00",
	         "newFlag":"0"
	      },
	      {
	         "appAccountId": "123",
	        "businessId":"223",
	        "profileName": "summer assessment",
	        "assessmentCd": "AF23",
	        "creationTime": "2015-06-12 00:00:00",
	        "orderTime":"2015-06-01 00:00:00",
	         "newFlag":"0"
	      },
	      {
	         "appAccountId": "124",
	        "businessId":"",
	        "profileName": "spring assessment",
	        "assessmentCd": "AD11",
	        "creationTime": "2015-06-01 00:00:00", 
	        "orderTime":"2015-06-01 00:00:00",
	        "newFlag":"1"
	      }
	   ]*/

		test.setAppAccountId(123);
		test.setAssessmentCd("YZ96");
		test.setBusinessId("200");
		test.setProfileName("spring assessment");
		test.setOrderTime("2015-06-02 00:00:00");
		test.setCreationTime("2015-06-01 00:00:00");
		test.setNewFlag("0");
		
		
		List<Test1> list = new ArrayList<Test1>();
		list.add(test);
		
		Test1 test2 = new Test1();
		test2.setAppAccountId(124);
		test2.setAssessmentCd("AF23");
		test2.setBusinessId("");
		test2.setProfileName("spring assessment");
		test2.setCreationTime("2015-06-01 00:00:00");
		test2.setOrderTime("2015-06-01 00:00:00");
		test2.setNewFlag("1");
		list.add(test2);
		
		String body = JSONArray.fromObject(list).toString();
		Map <String,String>headMap = new HashMap<String,String>();
		//ShoppingCart
		//52c698e116dbed4ce0066ff45e605c22
		headMap.put("Authorization", "qYs2vDurvstsqtotquouuRs9vDnveMhlkU");
		headMap.put("client_secret", "52c698e116dbed4ce0066ff45e605c22");
		headMap.put("Content-Type", "application/json");
		new HttpUtils().JsonHttpPost("", "http://agelocmestage.cn.nuskin.com/agelocme/api/v1/assessment", headMap);
	}
}
