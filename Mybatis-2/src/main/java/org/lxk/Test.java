package org.lxk;

import org.lxk.dao.UserDao2;
import org.lxk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author macos·lxk
 * @create 2020/7/7 10:18 上午
 */
@Service
public class Test {
    // 使用注解的调用测试

    @Autowired
    static UserDao2 userDao2;

    public void insert1(){
        User user = new User(5,"bbb","123",21,1);
        userDao2.insert(user);
    }

    public static void find(){
        List<User> allUser = userDao2.findAllUser();
        System.out.println(allUser);
    }

    public static void main(String[] args) {
        find();
    }
}
