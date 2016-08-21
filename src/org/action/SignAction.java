package org.action;

/**
 * Created by wcy on 2016/5/24.
 */

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.service.SignService;
import org.springframework.stereotype.Controller;
import org.vo.UserEntity;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class SignAction extends ActionSupport implements ModelDriven {
    private UserEntity user;

    @Override
    public Object getModel()
    {
        if (user == null)
            user = new UserEntity();
        return user;
    }

    @Resource
    private SignService signService;

    public String signin() throws Exception
    {
        UserEntity u = this.signService.checkSignin(user.getUserName(),user.getUserPwd());
        if(u!=null) {
            Map session = ActionContext.getContext().getSession();
            session.put("user",u);
            return SUCCESS;
        }
        else
            return ERROR;
    }
    public String signup() throws Exception
    {
        if(this.signService.signUp(user.getUserName(),user.getUserPwd()))
            return SUCCESS;
        else
            return ERROR;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
