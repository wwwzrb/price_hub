package model;

import java.util.List;

/**
 * Created by wz on 2016/8/22.
 */
public class userViewModel {
    private int userId;
    private String userName;
    private String userImage;
    private String userTime;
    private List<remarkViewModel> remarks;
    private List<userViewModel> follows;

    public List<remarkViewModel> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<remarkViewModel> remarks) {
        this.remarks = remarks;
    }

    public List<userViewModel> getFollows() {
        return follows;
    }

    public void setFollows(List<userViewModel> follows) {
        this.follows = follows;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }
}
