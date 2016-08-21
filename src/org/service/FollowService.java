package org.service;

import org.vo.UserEntity;

import java.util.List;

/**
 * Created by wz on 2016/6/17.
 */
public interface FollowService {
    boolean follow(int userId, int followId);
    List<UserEntity> getMyfollow(int userId);
    UserEntity searchUser(String userName);
}
