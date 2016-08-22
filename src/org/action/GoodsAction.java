package org.action;

import com.opensymphony.xwork2.ActionContext;
import model.Detail;
import model.General;
import org.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.tool.Pager;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by wz on 2016/8/22.
 */
@Controller
public class GoodsAction {
    private String classification;
    private int id;
    private int userId;
    private String remark;
    private int pageNow=1;
    private int pageSize=8;

    @Resource
    private GoodsService goodsService;


    public String general(){
        Map session = ActionContext.getContext().getSession();
        List<General> generals=goodsService.getGeneral(this.getPageNow(),this.getPageSize(),this.getClassification());
        session.put("general",generals);
        Pager page;
        if(session.get("page")!=null){
            page=new Pager(this.getPageNow(),((Pager)session.get("page")).getTotalSize());
        }
        else{
            page=new Pager(this.getPageNow(),goodsService.getSize(this.getClassification()));
        }
        session.put("page",page);
        session.put("classification",this.getClassification());
        return SUCCESS;
    }

    public String detail(){
        Map session = ActionContext.getContext().getSession();
        Detail details=goodsService.getDetail(this.getId());
        session.put("detail",details);
        return SUCCESS;
    }

    public String remark(){
        if(goodsService.remark(this.userId,this.id,this.getRemark()))
            return SUCCESS;
        else
            return ERROR;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
