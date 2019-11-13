package io.turntabl;

public class Customer {
    private int id;
    private String company_name;
    private String contact_name;
    private String contact_title;
    private String address;
    private String city;

    public Customer(int id, String company_name, String contact_name, String contact_title, String address, String city) {
        this.id = id;
        this.company_name = company_name;
        this.contact_name = contact_name;
        this.contact_title = contact_title;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_title() {
        return contact_title;
    }

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
