# CS 171 | Lab 8

Review 
- CurrentDirectory 
- package cs171.sum2023.lab8.API;
- Hopefully I will cover maven in lap9 and use external libraries

        <dependencies>
            <!-- ... other dependencies ... -->
            <dependency>
                <groupId>com.squareup.okhttp3</groupId>
                <artifactId>okhttp</artifactId>
                <version>4.9.2</version> <!-- use the latest version -->
            </dependency>
        </dependencies>

Then your implementation will be:

      import okhttp3.OkHttpClient;
      import okhttp3.Request;
      import okhttp3.Response;

      public class APICall {
      private static final String API_URL = "https://api.example.com/data"; // replace with your API URL

      public static void main(String[] args) throws Exception {
          OkHttpClient client = new OkHttpClient();

          Request request = new Request.Builder()
            .url(API_URL)
            .build(); // defaults to GET

              try (Response response = client.newCall(request).execute()) {
                  System.out.println(response.body().string());
              }
          }
      }

Or another library:

    <dependencies>
        <!-- ... other dependencies ... -->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.13</version> <!-- use the latest version -->
        </dependency>
    </dependencies>

Your implementation will be:

    import org.apache.http.HttpEntity;
    import org.apache.http.HttpResponse;
    import org.apache.http.client.methods.HttpGet;
    import org.apache.http.impl.client.CloseableHttpClient;
    import org.apache.http.impl.client.HttpClients;
    import org.apache.http.util.EntityUtils;

    public class APICall {
    private static final String API_URL = "https://api.example.com/data"; // replace with your API URL
    
        public static void main(String[] args) throws Exception {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet(API_URL);
    
            HttpResponse response = httpClient.execute(request);
    
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
    
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
    
            System.out.println(result);
        }
    }


- A4 Starter Code
- package cs171.sum2023.lab4.Sort;



Practice 

You are busy working on A3 and A4, just practice today lab and push them to  you repo. 

