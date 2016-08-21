package org.dao.impl;

import org.dao.FollowDao;
import org.dao.SuperDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.vo.FollowEntity;
import org.vo.UserEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wz on 2016/6/17.
 */
@Repository
public class FollowDaoImpl extends SuperDao implements FollowDao {

    @Override
    public boolean follow(UserEntity user, UserEntity follow){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        FollowEntity friendEntity=new FollowEntity();
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from FollowEntity where user.userId=? and follow.userId=?");
            query.setParameter(0,user.getUserId());
            query.setParameter(1,follow.getUserId());
            query.setMaxResults(1);
            FollowEntity exist=(FollowEntity) query.uniqueResult();
            if(exist!=null){
                return false;
            }
            friendEntity.setUser(user);
            friendEntity.setFollow(follow);
            session.save(friendEntity);
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }
        return true;
    }

    @Override
    public List<UserEntity> getMyfollow(UserEntity user){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        List<UserEntity> follows=new ArrayList<>();
        UserEntity user1;
        try{
            tx=session.beginTransaction();
            user1=(UserEntity) session.get(UserEntity.class,user.getUserId());
            follows.addAll(user1.getFollows());
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return follows;
    }

    @Override
    public UserEntity getUser(int userId){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        UserEntity user=new UserEntity();
        try{
            tx=session.beginTransaction();
            user=(UserEntity)session.get(UserEntity.class,userId);
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        return user;
    }

    @Override
    public UserEntity searchUser(String userName){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        UserEntity user=new UserEntity();
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from UserEntity where userName=?");
            query.setParameter(0,userName);
            query.setMaxResults(1);
            user=(UserEntity) query.uniqueResult();
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        return user;
    }

}
