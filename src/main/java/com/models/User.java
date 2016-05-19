package com.models;

import com.util.SuperClass;

/**
 * Created by echavez on 5/12/16.
 */
public class User extends SuperClass {

    public String name;
    public int age;
    public String email;
    public final String password = "MyPassword";

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean login(String password){

        if(this.getEmail() == "echavez@nearsoft.com" && password == this.password){
            return true;
        }
        return false;

    }
}
