package com.collections.set;

import com.models.Category;
import com.models.Product;
import com.models.User;
import com.util.SharedMethods;
import com.util.UsefullMethods;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by echavez on 5/19/16.
 */
public class EnumSetCollection extends SharedMethods{

    List<Product> items = new ArrayList<Product>();

    public EnumSetCollection(int size) {
        super(size);
        this.items = (List) this.generateRandomBucket();
    }


    public Collection<Product> generateRandomBucket() {

        User user = new User("Jorge Chavez", 24, "echavez@nearsoft.com");
        Product carro = new Product("Jetta 2015", UsefullMethods.generateRandomPrice(6000,9000), user, Category.CategoryProduct.AUTOMOTRIZ);
        Product ipad = new Product("iPad Air", UsefullMethods.generateRandomPrice(200,500), user, Category.CategoryProduct.ELECTRONICA);

        items.add(carro);
        items.add(ipad);

        return items;
    }

    public void testCollection() {

        System.out.println(this.getItems());

    }

    public Collection<Product> getItems() {
        return this.items;
    }


}
