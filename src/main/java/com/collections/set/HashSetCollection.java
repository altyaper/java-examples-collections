package com.collections.set;

import com.models.Product;
import com.models.User;
import com.util.SharedMethods;
import com.util.UsefullMethods;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by echavez on 5/18/16.
 */
public class HashSetCollection extends SharedMethods{

    private Set<Product> items = new HashSet<Product>();

    public HashSetCollection(int size){
        super(size);
        this.items = (Set) this.generateRandomBucket();
    }

    public Collection<Product> generateRandomBucket() {

        for(int i = 0; i < this.size; i++){

            try{
                User user = new User("Jorge Chavez", 24, UsefullMethods.generateRandomWord()+"@gmail.com");
                Product product = new Product(UsefullMethods.generateRandomWord(), UsefullMethods.generateRandomPrice(200,900), user);
                items.add(product);
            }catch (IOException e){
                System.out.print(e);
            }

        }

        return items;


    }

    public void testCollection() {
        System.out.println(items);
    }

    public Collection<Product> getItems() {
        return items;
    }

}
