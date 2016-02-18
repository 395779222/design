package com.utils;
import java.io.IOException;
import java.util.Random;
import org.apache.http.ParseException;
/**
* @ClassName: Test2
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2015年12月8日 下午2:27:33
*/
public class Test2 {
	public static void main(String[] args) throws ParseException, IOException {
		/*HttpClient httpClient = null;
		BasicHttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, 1000 * 1000);
		HttpConnectionParams.setSoTimeout(httpParams, 1000 * 1000);
		PoolingClientConnectionManager pcm = new PoolingClientConnectionManager();
		pcm.setMaxTotal(20000);
		pcm.setDefaultMaxPerRoute(pcm.getMaxTotal());
		httpClient = new DefaultHttpClient(pcm, httpParams);
		String url = "http://121.14.43.70:25128/argo_iap/SyncAppOrderReq";
		String entity = "{\"MSISDN\":\"\",\"actionID\":1,\"actionTime\":\"20151208102653\",\"appID\":\"300008928532\",\"channelID\":\"2200125968\",\"checkID\":0,\"exData\":\"1449541605\",\"feeMSISDN\":\"E1C674CBAB2CCF8D\",\"msgType\":\"SyncAppOrderReq\",\"orderID\":\"11151208102653273528\",\"payCode\":\"30000892853210\",\"price\":2000,\"programID\":\"\",\"subsNumb\":1,\"subsSeq\":1,\"totalPrice\":2000,\"tradeID\":\"4EBF5007D6\",\"transactionID\":\"CSSP12816315\",\"version\":\"1.0.0\"}";
		HttpPost httppost = new HttpPost(url);  
	    httppost.addHeader("Authorization", "your token"); //认证token  
	    httppost.addHeader("Content-Type", "application/json");  
	    httppost.addHeader("User-Agent", "imgfornote");  
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
		httppost.releaseConnection();*/
		rd();
	}	
	private static void rd(){
		  int[] intRet = new int[6]; 
          int intRd = 0; //存放随机数
          int count = 0; //记录生成的随机数个数
          int flag = 0; //是否已经生成过标志
          while(count<6){
               Random rdm = new Random(System.currentTimeMillis());
               intRd = Math.abs(rdm.nextInt())%10+1;
               for(int i=0;i<count;i++){
                   if(intRet[i]==intRd){
                       flag = 1;
                       break;
                   }else{
                       flag = 0;
                   }
               }
               if(flag==0){
                   intRet[count] = intRd;
                   count++;
               }
      }
     for(int t=0;t<6;t++){
         System.out.println(t+"->"+intRet[t]);
     }
  }
}	
