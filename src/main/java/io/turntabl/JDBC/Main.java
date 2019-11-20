package io.turntabl.JDBC;

import java.sql.*;


public class Main {

    public static void main (String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");

    String url = "jdbc:postgresql:northwind";

     try(Connection db = DriverManager.getConnection(url, "yaa-fordjour", "turntabl"))
    {
           Statement statement = db.createStatement();
           ResultSet resultSet = statement.executeQuery("select * from customers limit 7");
                   while (resultSet.next()) {
                       System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                       System.out.printf("%30s %30s %40s %15s %25s %25s %25s %25s %25s %25s ", "COMPANY_NAME", "CONTACT_NAME", "CONTACT_TITLE", "ADDRESS", "CITY", "REGION", "POSTAL_CODE", "COUNTRY", "PHONE", "FAX");
                       System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                       System.out.println(resultSet.getString("contact_name"));
                       System.out.println(resultSet.getString("contact_title"));
                       System.out.println(resultSet.getString("address"));
                       System.out.println(resultSet.getString("city"));
                       System.out.println(resultSet.getString("region"));
                       System.out.println(resultSet.getString("postal_code"));
                       System.out.println(resultSet.getString("country"));
                       System.out.println(resultSet.getString("phone"));
                       System.out.println(resultSet.getString("fax"));

                       System.out.println();
                   }
                   System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

} catch (SQLException sqle){
        System.err.println("Connection err: " + sqle);
        }



     CustomerDAOImpl cus = new CustomerDAOImpl();
     cus.getProductByCustomer("Aria Cruz");
    }
}


