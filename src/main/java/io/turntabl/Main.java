package io.turntabl;

import org.w3c.dom.ls.LSOutput;

import java.sql.*;



public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql:northwind";

        try (Connection db = DriverManager.getConnection(url, "yaa-fordjour", "turntabl")) {
            Statement statement = db.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customers limit 7");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%30s %30s %40s %15s %25s %25s %25s %25s %25s %25s ", "COMPANY_NAME", "CONTACT_NAME", "CONTACT_TITLE", "ADDRESS", "CITY", "REGION", "POSTAL_CODE", "COUNTRY", "PHONE", "FAX");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            while (resultSet.next())
            System.out.println(resultSet.getString("contact_name"));
            System.out.println(resultSet.getString("contact_title"));
            System.out.println(resultSet.getString("address"));
            System.out.println(resultSet.getString("city"));
            System.out.println(resultSet.getString("region"));
            System.out.println(resultSet.getString("postal_code"));
            System.out.println(resultSet.getString("country"));
            System.out.println(resultSet.getString("phone"));
            System.out.println(resultSet.getString("fax"));
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } catch(SQLException sqle){
                System.err.println("Connection err: " + sqle);
            }

        }
    }


