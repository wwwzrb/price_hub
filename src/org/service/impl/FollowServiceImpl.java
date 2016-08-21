package org.service.impl;

import org.dao.FollowDao;
import org.service.FollowService;
import org.springframework.stereotype.Service;
import org.vo.UserEntity;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wz on 2016/6/17.
 */
@Service
public class FollowServiceImpl implements FollowService{

    @Resource
    FollowDao followDao;


    @Override
    public boolean follow(int userId,int friendId){
        return followDao.follow(followDao.getUser(userId),followDao.getUser(friendId));
    }

    @Override
    public List<UserEntity> getMyfollow(int userId){
        return followDao.getMyfollow(followDao.getUser(userId));
    }

    @Override
    public UserEntity searchUser(String userName){
        return followDao.searchUser(userName);
    }

}
