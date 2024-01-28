package com.sagar.interview;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class InventoryApiClient {
    public static void main(String[] args) {
        String barcode = "74001755";  // Replace with the actual barcode

        try {
            // Construct the URL with the barcode as a query parameter
            String apiUrl = "http://json/inventory?barcode=" + barcode;
            System.out.println(apiUrl);

            // Create a URL object
            URL url = new URL(apiUrl);
            System.out.println(url);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response from the API using BufferedReader and streams
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }

                    // Parse the JSON response
                    JSONObject jsonResponse = new JSONObject(response.toString());

                    // Extract the "data" array
                    JSONArray dataArray = jsonResponse.getJSONArray("data");

                    if (dataArray.length() > 0) {
                        // Assuming there is only one item in the array
                        JSONObject itemData = dataArray.getJSONObject(0);

                        // Extract "price" and "discount" values
                        int price = itemData.getInt("price");
                        int discount = itemData.getInt("discount");

                        // Print or use the extracted values
                        System.out.println("Price: " + price);
                        System.out.println("Discount: " + discount);
                    } else {
                        System.out.println("Error: 'data' array is empty in the JSON response");
                    }
                }
            } else {
                System.out.println("Error: HTTP Request failed with response code " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
