package net.blf2.dao.intefaces;

import net.blf2.model.UserInfo;

/**
 * Created by t_mengxh on 2016/10/28.
 */
public interface IUserInfoDao extends IBaseDao<UserInfo> {
    UserInfo queryUserInfoByEmail(String userEmail);
    UserInfo queryUserInfoByNickName(String nickName);
}
