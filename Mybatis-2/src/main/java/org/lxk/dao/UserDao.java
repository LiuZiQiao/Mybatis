package org.lxk.dao;

import org.apache.ibatis.session.SqlSession;
import org.lxk.entity.User;
import org.lxk.utils.MybatisSessionUtil;


/**
 * @author macos
 */
public class UserDao {
    SqlSession session = MybatisSessionUtil.getSession();

    public int insert(User user){
        // 第一个参数是mapper xml里的namespace+MappedStatement对应的id
        int rint = session.insert("user.insert",user);
        session.commit();// 不要忘记提交
        return rint;
    }

}