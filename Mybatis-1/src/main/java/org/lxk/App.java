package org.lxk;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.lxk.dao.UserDao;
import org.lxk.entity.User;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Test
    public void findUserById(){
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User(2,"zzz","123",22,0);
        userDao.insert(user);
    }

    @Test
    public void findAllUser(){
        SqlSession sqlsession = getSqlSessionFactory().openSession();
        UserDao userDao = sqlsession.getMapper(UserDao.class);
        List<User> userList = userDao.findAllUsers();
        System.out.println(userList);
    }
    private SqlSessionFactory getSqlSessionFactory(){
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis-configuration.xml";

        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
