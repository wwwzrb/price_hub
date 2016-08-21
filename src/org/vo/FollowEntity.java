package org.vo;

import java.sql.Timestamp;

/**
 * Created by wz on 2016/8/21.
 */
public class FollowEntity {
    private int id;
    private Timestamp followTime;
    private UserEntity user;
    private UserEntity follow;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public UserEntity getFollow() {
        return follow;
    }

    public void setFollow(UserEntity follow) {
        this.follow = follow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Timestamp followTime) {
        this.followTime = followTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FollowEntity that = (FollowEntity) o;

        if (id != that.id) return false;
        if (followTime != null ? !followTime.equals(that.followTime) : that.followTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (followTime != null ? followTime.hashCode() : 0);
        return result;
    }
}
