package org.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wz on 2016/8/21.
 */
public class GoodsEntity {
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
    private String classification;
    private Set<RemarkEntity> remarks=new HashSet<>();

    public Set<RemarkEntity> getRemarks() {
        return remarks;
    }

    public void setRemarks(Set<RemarkEntity> remarks) {
        this.remarks = remarks;
    }

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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (id != that.id) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productCover != null ? !productCover.equals(that.productCover) : that.productCover != null) return false;
        if (productParam != null ? !productParam.equals(that.productParam) : that.productParam != null) return false;
        if (priceJd != null ? !priceJd.equals(that.priceJd) : that.priceJd != null) return false;
        if (priceAmazon != null ? !priceAmazon.equals(that.priceAmazon) : that.priceAmazon != null) return false;
        if (priceOne != null ? !priceOne.equals(that.priceOne) : that.priceOne != null) return false;
        if (nameJd != null ? !nameJd.equals(that.nameJd) : that.nameJd != null) return false;
        if (nameAmazon != null ? !nameAmazon.equals(that.nameAmazon) : that.nameAmazon != null) return false;
        if (nameOne != null ? !nameOne.equals(that.nameOne) : that.nameOne != null) return false;
        if (linkJd != null ? !linkJd.equals(that.linkJd) : that.linkJd != null) return false;
        if (linkAmazon != null ? !linkAmazon.equals(that.linkAmazon) : that.linkAmazon != null) return false;
        if (linkOne != null ? !linkOne.equals(that.linkOne) : that.linkOne != null) return false;
        if (classification != null ? !classification.equals(that.classification) : that.classification != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productCover != null ? productCover.hashCode() : 0);
        result = 31 * result + (productParam != null ? productParam.hashCode() : 0);
        result = 31 * result + (priceJd != null ? priceJd.hashCode() : 0);
        result = 31 * result + (priceAmazon != null ? priceAmazon.hashCode() : 0);
        result = 31 * result + (priceOne != null ? priceOne.hashCode() : 0);
        result = 31 * result + (nameJd != null ? nameJd.hashCode() : 0);
        result = 31 * result + (nameAmazon != null ? nameAmazon.hashCode() : 0);
        result = 31 * result + (nameOne != null ? nameOne.hashCode() : 0);
        result = 31 * result + (linkJd != null ? linkJd.hashCode() : 0);
        result = 31 * result + (linkAmazon != null ? linkAmazon.hashCode() : 0);
        result = 31 * result + (linkOne != null ? linkOne.hashCode() : 0);
        result = 31 * result + (classification != null ? classification.hashCode() : 0);
        return result;
    }
}
