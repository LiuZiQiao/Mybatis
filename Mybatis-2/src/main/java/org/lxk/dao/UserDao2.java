package org.lxk.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.lxk.entity.User;

import java.util.List;

/**
 * @Author macos·lxk
 * @create 2020/7/7 9:39 上午
 */
@Mapper
public interface UserDao2 {

    @Insert("insert into user(id,name,password,age,deleteflage) values(#{id},#{name},#{password},#{age},#{deleteflage})")
    void insert(User user);

    @Select("select *from user")
    List<User> findAllUser();
}
