package org.service.impl;

import model.Detail;
import model.General;
import org.dao.GoodsDao;
import org.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * Created by wz on 2016/8/22.
 */
import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<General> getGeneral(int pageNow, int pageSize, String classification){
        return goodsDao.getGeneral(pageNow,pageSize,classification);
    }

    @Override
    public Detail getDetail(int id){
        return goodsDao.getDetail(id);
    }

    @Override
    public int getSize(String classification){
        return goodsDao.getSize(classification);
    }

    @Override
    public boolean remark(int userId,int id,String remark){
        return goodsDao.remark(userId,id,remark);
    }
}
