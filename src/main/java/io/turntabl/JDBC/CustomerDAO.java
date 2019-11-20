package io.turntabl.JDBC;

import java.sql.SQLException;

public interface CustomerDAO {
    public void getProductByCustomer(String contact_name) throws SQLException, ClassNotFoundException;
    public void getCustomerSalesForAGivenWeek();
    public void deleteCustomer() throws SQLException;
    public void delete() throws SQLException;
}
