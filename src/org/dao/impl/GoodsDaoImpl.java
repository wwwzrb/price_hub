package org.dao.impl;

import model.Detail;
import model.General;
import model.remarkViewModel;
import org.dao.GoodsDao;
import org.dao.SuperDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.vo.GoodsEntity;
import org.vo.RemarkEntity;
import org.vo.UserEntity;
/**
 * Created by wz on 2016/8/21.
 */

import java.util.ArrayList;
import java.util.List;

@Repository
public class GoodsDaoImpl extends SuperDao implements GoodsDao {

    @Override
    public List<General> getGeneral(int pageNow, int pageSize, String classification)
    {
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        List<General> generalList=new ArrayList<General>();
        General general;
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from GoodsEntity where classification=?");
            query.setParameter(0,classification);
            query.setFirstResult((pageNow-1)*pageSize);
            query.setMaxResults(pageSize);
            List<GoodsEntity> list=query.list();
            for(GoodsEntity goods:list){
                general=new General();
                general.setId(goods.getId());
                general.setProductName(goods.getProductName());
                general.setProductCover(goods.getProductCover());
                if(goods.getPriceJd()!=null)
                    general.setPrice(goods.getPriceJd());
                else if(goods.getPriceAmazon()!=null)
                    general.setPrice(goods.getPriceAmazon());
                else
                    general.setPrice(goods.getPriceOne());
                generalList.add(general);
            }
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
        return generalList;
    }
    @Override
    public Detail getDetail(int id){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        List<remarkViewModel> remarkViewModelList=new ArrayList<remarkViewModel>();
        remarkViewModel remarkViewModel;
        GoodsEntity goods;
        Detail detail=new Detail();
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from GoodsEntity where id=?");
            query.setParameter(0,id);
            query.setMaxResults(1);
            goods=(GoodsEntity) query.uniqueResult();
            detail.setId(goods.getId());
            detail.setProductCover(goods.getProductCover());
            detail.setProductName(goods.getProductName());
            detail.setProductParam(goods.getProductParam());
            String str = goods.getProductParam();
            String[] temp = str.split("[,;]");
            List list=java.util.Arrays.asList(temp);
            detail.setList(list);
            detail.setLinkAmazon(goods.getLinkAmazon());
            detail.setPriceAmazon(goods.getPriceAmazon());
            detail.setNameAmazon(goods.getNameAmazon());
            detail.setPriceJd(goods.getPriceJd());
            detail.setLinkJd(goods.getLinkJd());
            detail.setNameJd(goods.getNameJd());
            detail.setLinkOne(goods.getLinkOne());
            detail.setPriceOne(goods.getPriceOne());
            detail.setNameOne(goods.getNameOne());
            for(RemarkEntity remark:goods.getRemarks()){
                remarkViewModel=new remarkViewModel();
                remarkViewModel.setRemarkId(remark.getRemarkId());
                remarkViewModel.setRemark(remark.getRemark());
                remarkViewModel.setRemarkTime(remark.getRemarkTime());
                remarkViewModel.setUserId(remark.getUser().getUserId());
                remarkViewModel.setUserName(remark.getUser().getUserName());
                remarkViewModel.setUserImage(remark.getUser().getUserImage());
                remarkViewModelList.add(remarkViewModel);
            }
            detail.setRemarks(remarkViewModelList);
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
        return detail;
    }

    public int getSize(String classification){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        int size=0;
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from GoodsEntity where classification=?");
            query.setParameter(0,classification);
            size=query.list().size();
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        return size ;
    }

    @Override
    public boolean remark(int userId,int id,String remark){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        RemarkEntity remarkEntity=new RemarkEntity();
        try{
            tx=session.beginTransaction();
            UserEntity user=(UserEntity)session.get(UserEntity.class,userId);
            GoodsEntity goods=(GoodsEntity)session.get(GoodsEntity.class,id);
            remarkEntity.setGoods(goods);
            remarkEntity.setUser(user);
            remarkEntity.setRemark(remark);
            session.save(remarkEntity);
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
}
