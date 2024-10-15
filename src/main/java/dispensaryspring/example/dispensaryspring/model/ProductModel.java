package dispensaryspring.example.dispensaryspring.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class ProductModel {

    @Id
//    @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Product_id;
    private Integer Product_product_list_id;
    private String Product_price;
    private String Product_quantity;
    private String Product_balance;
//    @Column(name="product_description", length=5)
    private String Product_description;
    private String Product_created_date;
    private String Product_created_by;
    private String Product_initial_sale_price;
    private String Product_sale_price;

    public ProductModel() {
    }

    public ProductModel(Integer product_id, Integer product_product_list_id, String product_price, String product_quantity,String product_balance, String product_description, String product_created_date, String product_created_by, String product_initial_sale_price, String product_sale_price) {
        Product_id = product_id;
        Product_product_list_id = product_product_list_id;
        Product_price = product_price;
        Product_quantity = product_quantity;
        Product_balance = product_balance;
        Product_description = product_description;
        Product_created_date = product_created_date;
        Product_created_by = product_created_by;
        Product_sale_price = product_sale_price;
        Product_initial_sale_price = product_initial_sale_price;
    }

    public Integer getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Integer product_id) {
        Product_id = product_id;
    }

    public Integer getProduct_product_list_id() {
        return Product_product_list_id;
    }

    public void setProduct_product_list_id(Integer product_product_list_id) {
        Product_product_list_id = product_product_list_id;
    }

    public String getProduct_price() {
        return Product_price;
    }

    public void setProduct_price(String product_price) {
        Product_price = product_price;
    }

    public String getProduct_quantity() {
        return Product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        Product_quantity = product_quantity;
    }

    public String getProduct_balance() {
        return Product_balance;
    }

    public void setProduct_balance(String product_balance) {
        Product_balance = product_balance;
    }

    public String getProduct_description() {
        return Product_description;
    }

    public void setProduct_description(String product_description) {
        Product_description = product_description;
    }

    public String getProduct_created_date() {
        return Product_created_date;
    }

    public void setProduct_created_date(String product_created_date) {
        Product_created_date = product_created_date;
    }

    public String getProduct_created_by() {
        return Product_created_by;
    }

    public void setProduct_created_by(String product_created_by) {
        Product_created_by = product_created_by;
    }

    public String getProduct_initial_sale_price() {
        return Product_initial_sale_price;
    }

    public void setProduct_initial_sale_price(String product_initial_sale_price) {
        Product_initial_sale_price = product_initial_sale_price;
    }

    public String getProduct_sale_price() {
        return Product_sale_price;
    }

    public void setProduct_sale_price(String product_sale_price) {
        Product_sale_price = product_sale_price;
    }

}
