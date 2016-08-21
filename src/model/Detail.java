package model;

import java.util.List;

/**
 * Created by wz on 2016/8/21.
 */
public class Detail {
    private int id;
    private String productName;
    private String productCover;
    private String productParam;
    private Double priceJd;
    private Double priceAmazon;
    private Double priceOne;
    private String nameJd;
    private String nameAmazon;
    private String nameOne;
    private String linkJd;
    private String linkAmazon;
    private String linkOne;
    private List list;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getProductParam() {
        return productParam;
    }

    public void setProductParam(String productParam) {
        this.productParam = productParam;
    }

    public Double getPriceJd() {
        return priceJd;
    }

    public void setPriceJd(Double priceJd) {
        this.priceJd = priceJd;
    }

    public Double getPriceAmazon() {
        return priceAmazon;
    }

    public void setPriceAmazon(Double priceAmazon) {
        this.priceAmazon = priceAmazon;
    }

    public Double getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(Double priceOne) {
        this.priceOne = priceOne;
    }

    public String getNameJd() {
        return nameJd;
    }

    public void setNameJd(String nameJd) {
        this.nameJd = nameJd;
    }

    public String getNameAmazon() {
        return nameAmazon;
    }

    public void setNameAmazon(String nameAmazon) {
        this.nameAmazon = nameAmazon;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getLinkJd() {
        return linkJd;
    }

    public void setLinkJd(String linkJd) {
        this.linkJd = linkJd;
    }

    public String getLinkAmazon() {
        return linkAmazon;
    }

    public void setLinkAmazon(String linkAmazon) {
        this.linkAmazon = linkAmazon;
    }

    public String getLinkOne() {
        return linkOne;
    }

    public void setLinkOne(String linkOne) {
        this.linkOne = linkOne;
    }

    private List<remarkViewModel> remarks;

    public List<remarkViewModel> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<remarkViewModel> remarks) {
        this.remarks = remarks;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
