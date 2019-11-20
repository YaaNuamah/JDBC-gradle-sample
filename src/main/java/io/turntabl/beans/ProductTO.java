io.turntabl.beans;

public class ProductTO {
    private String product_name;
    private Integer unit_price;

    public ProductTO() {}

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Integer unit_price) {
        this.unit_price = unit_price;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ProductTO{" +
                "product_name='" + product_name + '\'' +
                ", unit_price=" + unit_price +
                '}';
    }
}
