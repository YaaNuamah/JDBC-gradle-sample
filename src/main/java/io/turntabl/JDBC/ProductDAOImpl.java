package io.turntabl.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO {
    @Override
    public void getProductsByCustomer(String Contact_name) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try(Connection db = DriverManager.getConnection(url, "yaa-fordjour", "turntabl")) {
                System.out.println("Connected to the postgreSQL server successfully");

             PreparedStatement ps = db.prepareStatement("select product_name from products");
            }
    }

    @Override
    public void getFiveMostPopularProducts() {

    }

    @Override
    public void getProductSalesForAGivenWeek() {

    }
}
