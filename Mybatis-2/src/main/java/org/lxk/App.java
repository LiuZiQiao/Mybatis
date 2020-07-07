package org.lxk;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.lxk.dao.UserDao2;
import org.lxk.entity.User;
import org.lxk.utils.MybatisSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Hello world!
 *
 */

public class App{
    private User user;

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }

    //不使用mapper映射测试,也就是UserDao中的namespace名字不用写全路径包名

    SqlSession session = MybatisSessionUtil.getSession();

    @Test
    public void insert(){
        User user = new User(4,"aaa","213",21,1);
        int id = session.insert("insert",user);
        session.commit();
    }

    @Test
    public void findUserById(){
        User user = session.selectOne("findUserById",4);
        System.out.println(user);
    }

//    @Test
//    public void findAllUser(){
//        List<User> user = null;
//        session.select("findAllUsers", (ResultHandler) user);
//        System.out.println(user);
//    }



}
