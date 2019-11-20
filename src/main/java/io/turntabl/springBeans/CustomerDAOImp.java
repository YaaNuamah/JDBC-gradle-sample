package io.turntabl.springBeans;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerDAOImp implements CustomerDAO{
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<CustomerTO> getAllCustomers() {
        return this.jdbcTemplate.query("select * from customers", new BeanPropertyRowMapper<CustomerTO>(CustomerTO.class));
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
