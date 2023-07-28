package cs171.sum2023.lab8.API;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class APICall {

//    private static final String API_URL = "https://api.publicapis.org/entries"; // https://apipheny.io/free-api/
//    private static final String API_URL = "https://api.publicapis.org/random"; // https://apipheny.io/free-api/
//    private static final String API_URL = "https://api.publicapis.org/categories"; // https://apipheny.io/free-api/
    private static final String API_URL = "https://api.publicapis.org/health"; // https://apipheny.io/free-api/

    public static void main(String[] args) throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();
            System.out.println("Response Content: " + response.toString());
        } else {
            System.out.println("GET request failed");
        }
    }
}

