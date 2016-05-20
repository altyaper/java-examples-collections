package com.collections.list;

import com.models.Category;
import com.models.Product;
import com.models.User;
import com.util.SharedMethods;
import com.util.UsefullMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by echavez on 5/18/16.
 */
public class ArrayListCollection extends SharedMethods{

    private List<Product> items = new ArrayList<Product>();

    public ArrayListCollection(int size){
        super(size);
        this.items = (List) this.generateRandomBucket();
    }

    public Collection<Product> generateRandomBucket(){

        for(int i = 0; i < this.size; i++){

            try{
                User user = new User("Jorge Chavez", 24, UsefullMethods.generateRandomWord()+"@gmail.com");
                Product product = new Product(UsefullMethods.generateRandomWord(), UsefullMethods.generateRandomPrice(200,900), user, Category.CategoryProduct.HOGAR);
                items.add(product);
            }catch (IOException e){
                System.out.print(e);
            }

        }

        return items;

    }

    public void testCollection() {
        Iterator i = items.iterator();
        while(i.hasNext()){
            Product p = (Product) i.next();
            System.out.println(p);
        }
    }

    public Collection<Product> getItems() {
        return items;
    }


}
