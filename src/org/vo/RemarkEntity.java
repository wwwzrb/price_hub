package org.vo;

import java.sql.Timestamp;

/**
 * Created by wz on 2016/8/21.
 */
public class RemarkEntity {
    private int remarkId;
    private String remark;
    private Timestamp remarkTime;
    private UserEntity user;
    private GoodsEntity goods;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public GoodsEntity getGoods() {
        return goods;
    }

    public void setGoods(GoodsEntity goods) {
        this.goods = goods;
    }

    public int getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(int remarkId) {
        this.remarkId = remarkId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Timestamp remarkTime) {
        this.remarkTime = remarkTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemarkEntity that = (RemarkEntity) o;

        if (remarkId != that.remarkId) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (remarkTime != null ? !remarkTime.equals(that.remarkTime) : that.remarkTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = remarkId;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (remarkTime != null ? remarkTime.hashCode() : 0);
        return result;
    }
}
