package net.blf2.dao.intefaces;

import java.util.List;

/**
 * Created by t_mengxh on 2016/10/28.
 */
public interface  IBaseDao<T> {
    T queryById(String id);
    T insertInfo(T t);
    Boolean updateInfo(T t);
    Boolean deleteinfo(T t);
    List<T> queryAll();
}
