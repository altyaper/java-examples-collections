package com.models;

import com.util.SuperClass;

/**
 * Created by echavez on 5/12/16.
 */
public class Product extends SuperClass implements Comparable<Product> {

    public String name;
    public double price;
    public User user;

    public Category.CategoryProduct category;

    public Product() {

    }

    public Product(String name, double price, User user){

        this.name = name;
        this.price = price;
        this.user = user;

    }

    public Product(String name, double price, User user, Category.CategoryProduct category){

        this.name = name;
        this.price = price;
        this.user = user;
        this.category = category;

    }

    public Category.CategoryProduct getCategory() {
        return category;
    }

    public void setCategory(Category.CategoryProduct category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int compareTo(Product o) {
        if(o == null){
            return -1;
        }
        if(this.getPrice() > o.getPrice()){
            return 1;
        } else if(this.getPrice() < o.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }


}
