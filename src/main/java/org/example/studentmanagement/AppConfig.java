package org.example.studentmanagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class AppConfig {
    @Bean
    Connection getConnection() throws SQLException {

        String url = "jdbc:sqlite:/Users/cbs_ams_support/Desktop/Skilltraining/users.db";
        System.out.println("URL:::::"+url);
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }
    @Bean
   String getMessage(){
       return "This is Student Management Project";
   }
}
