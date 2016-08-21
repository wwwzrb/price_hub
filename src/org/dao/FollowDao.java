package org.dao;

import org.vo.UserEntity;

import java.util.List;

/**
 * Created by wz on 2016/6/16.
 */
public interface FollowDao {
    boolean follow(UserEntity user, UserEntity friend);
    List<UserEntity> getMyfollow(UserEntity user);
    UserEntity getUser(int userId);
    UserEntity searchUser(String userName);
}
