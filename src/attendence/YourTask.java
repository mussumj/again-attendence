/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import java.util.TimerTask;
    import java.io.BufferedReader;
import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
    import java.net.URL;
    import java.net.URLConnection;
    import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
     
   
/**
 *
 * @author mannan impax
 */
public class YourTask extends TimerTask {

    public YourTask() {
    }

    @Override
    public void run() {
System.out.println("HII") ; 
OkHttpClient client = new OkHttpClient();

MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n\t\n\t\"api_key\" :\"tahseenakhtar3@gmail.com\",\n\t\"api_token\":\"37c6e4ad16e88778b3d669e8ea02639d1549351616\",\n\t\"sender\":\"demoos\",\n\t\"receiver\":\"8182865183\",\n\t\"msgtype\":\"1\",\n\t\"sms\":\"hii there\"\n\t\n}");
Request request = new Request.Builder()
  .url("https://www.bulksmsplans.com/Restapis/send_sms")
  .post(body)
  .addHeader("Content-Type", "application/json")
  .addHeader("cache-control", "no-cache")
  .addHeader("Postman-Token", "af144b8b-d5e1-4e29-bc4b-0da5c5985f82")
  .build();

                try {
                    Response response = client.newCall(request).execute();
                } catch (IOException ex) {
                    Logger.getLogger(sendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("message send");
//try {
////    			// Construct data
////    			String apiKey = "apikey=" + "7HNezVi5X3Q-M5IPRj0nmx8t1KUx79F60gGMt7qugI";
////    			String message = "&message=" + "Hi your employee was absent";
////    			String sender = "&sender=" + "TXTLCL";
////    			String numbers = "&numbers=" + "918182865183";
////    			
////    			// Send data
////    			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
////    			String data = apiKey + numbers + message + sender;
////    			conn.setDoOutput(true);
////    			conn.setRequestMethod("POST");
////    			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
////    			conn.getOutputStream().write(data.getBytes("UTF-8"));
////    			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
////    			final StringBuffer stringBuffer = new StringBuffer();
////    			String line;
////    			while ((line = rd.readLine()) != null) {
////    				stringBuffer.append(line);
////    			}
////    			rd.close();
////    			     System.out.println("MESSAGE SENT");
//    			//return stringBuffer.toString();
//                        
//    		} catch (Exception e) {
//    			System.out.println("Error SMS "+e);
//    			//return "Error "+e;
//    		}
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
