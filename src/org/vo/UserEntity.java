package org.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wz on 2016/8/21.
 */
public class UserEntity {
    private int userId;
    private String userName;
    private String userPwd;
    private String userImage;
    private Timestamp userTime;
    private Set<PreferEntity> preferences=new HashSet<>();
    private Set<UserEntity> follows=new HashSet<>();
    private Set<RemarkEntity> remarks=new HashSet<>();

    public Set<PreferEntity> getPreferences() {
        return preferences;
    }

    public void setPreferences(Set<PreferEntity> preferences) {
        this.preferences = preferences;
    }

    public Set<UserEntity> getFollows() {
        return follows;
    }

    public void setFollows(Set<UserEntity> follows) {
        this.follows = follows;
    }

    public Set<RemarkEntity> getRemarks() {
        return remarks;
    }

    public void setRemarks(Set<RemarkEntity> remarks) {
        this.remarks = remarks;
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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Timestamp getUserTime() {
        return userTime;
    }

    public void setUserTime(Timestamp userTime) {
        this.userTime = userTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (userImage != null ? !userImage.equals(that.userImage) : that.userImage != null) return false;
        if (userTime != null ? !userTime.equals(that.userTime) : that.userTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (userImage != null ? userImage.hashCode() : 0);
        result = 31 * result + (userTime != null ? userTime.hashCode() : 0);
        return result;
    }
}

