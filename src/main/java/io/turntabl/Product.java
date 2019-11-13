package io.turntabl;

public class Product {
          private String product_name;
          private int supplier_id;
          private int category_id;
          private int quantity_per_unit;
          private double unit_price;
          private int units_in_stock;
          private int units_on_order;

    public Product(String product_name, int supplier_id, int category_id, int quantity_per_unit, double unit_price, int units_in_stock, int units_on_order) {
        this.product_name = product_name;
        this.supplier_id = supplier_id;
        this.category_id = category_id;
        this.quantity_per_unit = quantity_per_unit;
        this.unit_price = unit_price;
        this.units_in_stock = units_in_stock;
        this.units_on_order = units_on_order;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getQuantity_per_unit() {
        return quantity_per_unit;
    }

    public void setQuantity_per_unit(int quantity_per_unit) {
        this.quantity_per_unit = quantity_per_unit;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(int units_in_stock) {
        this.units_in_stock = units_in_stock;
    }

    public int getUnits_on_order() {
        return units_on_order;
    }

    public void setUnits_on_order(int units_on_order) {
        this.units_on_order = units_on_order;
    }
}
