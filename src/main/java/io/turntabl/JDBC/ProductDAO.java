package io.turntabl.JDBC;

import java.sql.SQLException;

public interface ProductDAO {
    public void getProductsByCustomer(String Contact_name) throws ClassNotFoundException, SQLException;
    public void getFiveMostPopularProducts();
    public void getProductSalesForAGivenWeek();
}
