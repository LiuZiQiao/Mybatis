package org.lxk.entity;

import java.io.Serializable;

/**
 * user
 * @author 
 */

public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    private Integer deleteflage;

    private static final long serialVersionUID = 1L;

    public User(Integer id, String name, String password, Integer age, Integer deleteflage) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.deleteflage = deleteflage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeleteflage() {
        return deleteflage;
    }

    public void setDeleteflage(Integer deleteflage) {
        this.deleteflage = deleteflage;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", deleteflage=" + deleteflage +
                '}';
    }
}