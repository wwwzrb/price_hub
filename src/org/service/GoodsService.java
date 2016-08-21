package org.service;

import model.Detail;
import model.General;

import java.util.List;

/**
 * Created by wz on 2016/8/22.
 */
public interface GoodsService {
    List<General> getGeneral(int pageNow, int pageSize, String classification);
    Detail getDetail(int id);
    int getSize(String classification);
    boolean remark(int userId,int id,String remark);
}
