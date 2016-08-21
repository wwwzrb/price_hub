package model;

import org.vo.RemarkEntity;

import java.util.List;


/**
 * Created by wz on 2016/8/21.
 */
public class General {
    private int id;
    private String productName;
    private String productCover;
    private Double price;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCover() {
        return productCover;
    }

    public void setProductCover(String productCover) {
        this.productCover = productCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}