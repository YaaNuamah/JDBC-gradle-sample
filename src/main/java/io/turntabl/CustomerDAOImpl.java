package io.turntabl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public void getProductByCustomer() throws SQLException {
        try(Connection db = DriverManager.getConnection("url", "yaa-fordjour", "turntabl")) {
            
        }

    }

    @Override
    public void deleteCustomer(Customer customer) throws SQLException {
    }
    @Override
    public void delete(Customer customer) throws SQLException {
    }


}
