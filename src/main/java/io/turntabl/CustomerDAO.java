package io.turntabl;

import java.sql.SQLException;

public interface CustomerDAO {
    public void getProductByCustomer() throws SQLException;
    public void deleteCustomer(Customer customer) throws SQLException;
    public void delete(Customer customer) throws SQLException;
}
