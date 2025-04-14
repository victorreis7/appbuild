package com.greenanimalsbank;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            Properties config = new Properties();
            config.load(new FileInputStream("config/config.properties"));

            String dbUser = config.getProperty("db.user");
            String dbPass = config.getProperty("db.password");
            String apiKey = config.getProperty("api.key");

            System.out.println("Connecting to greenanimalsbank.com with user: " + dbUser);
            // Simulate authentication
            if ("greenadmin".equals(dbUser) && "green@1234".equals(dbPass)) {
                System.out.println("Authentication successful. API Key: " + apiKey);
            } else {
                System.out.println("Authentication failed.");
            }
        } catch (IOException e) {
            System.out.println("Error reading config: " + e.getMessage());
        }
    }
}
