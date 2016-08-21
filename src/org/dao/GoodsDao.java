package org.dao;

import model.Detail;
import model.General;
import org.vo.GoodsEntity;

import java.util.List;

/**
 * Created by wz on 2016/8/21.
 */
public interface GoodsDao {
    List<General> getGeneral(int pageNow,int pageSize,String classification);
    Detail getDetail(int id);
    int getSize(String classfication);
    boolean remark(int userId,int id,String remark);
}
