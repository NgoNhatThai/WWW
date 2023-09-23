package vn.edu.iuh.fit.www_week2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import vn.edu.iuh.fit.www_week2.enums.ProductStatus;
@Entity
@Table(name = "products")
public class Product {
    //product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    @Column(name = "product_id")
    private int productId;
    private String name;
    private String desciption;
    private String unit;
    @Column(name = "manufaturer_name")
    private String manufacturerName;
    @Column(name = "status")
    private ProductStatus productStatus;

    public Product() {
    }

    public Product(int productId, String name, String desciption, String unit, String manufacturerName, ProductStatus productStatus) {
        this.productId = productId;
        this.name = name;
        this.desciption = desciption;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }
}
