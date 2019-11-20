package io.turntabl.JDBC;

import java.sql.*;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public void getProductByCustomer(String contact_name) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:northwind";

        try(Connection db = DriverManager.getConnection(url, "yaa-fordjour", "turntabl")) {
            System.out.println("Connected to the PostgreSQL server successfully");

            PreparedStatement preparedStatement = db.prepareStatement("select product_name, order_details.unit_price from products" + "inner join order_details on products.product_id = order_details.product_id" + "inner join orders on order_details.order_id = orders.order_id" + "inner join customers on orders.customer_id = customers.customer_id" + "where customers.contact_name like ? ");

            preparedStatement.setString(1, contact_name);
            ResultSet rs = preparedStatement.executeQuery();

            System.out.println("--------------------");
            System.out.printf("%15s", "CONTACT NAME");
            System.out.println("\n------------------");

            while (rs.next()) {
                System.out.printf("%15s", rs.getString( "contact_name"));
                System.out.println();
            }
            System.out.println("\n------------------");
        }

        catch(SQLException sqle) {
            System.err.println("Connection err:" + sqle);
        }



    }

    @Override
    public void getCustomerSalesForAGivenWeek() {

    }


    @Override
    public void deleteCustomer() throws SQLException {

    }

    @Override
    public void delete() throws SQLException {

    }



}
