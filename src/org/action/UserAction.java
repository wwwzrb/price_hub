package org.action;

import com.opensymphony.xwork2.ActionContext;
import org.dao.FollowDao;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.vo.UserEntity;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by wz on 2016/8/22.
 */
@Controller
public class UserAction {
    private int userId;

    @Resource
    FollowDao followDao;


    public String follow(){
        Map session = ActionContext.getContext().getSession();
        if(followDao.follow((UserEntity) session.get("user"),followDao.getUser(this.getUserId())))
            return SUCCESS;
        else
            return ERROR;
    }

    public String view(){
        Map session = ActionContext.getContext().getSession();
        if(session.get("user")==null)
            return ERROR;
        UserEntity user=followDao.getUser(this.getUserId());
        session.put("view",user);
        return SUCCESS;
    }

    public String viewFollows(){
        Map session = ActionContext.getContext().getSession();
        if(session.get("user")==null)
            return ERROR;
        UserEntity user=followDao.getUser(this.getUserId());
        List list=followDao.getMyfollow(user);
        session.put("follows",list);
        return SUCCESS;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
