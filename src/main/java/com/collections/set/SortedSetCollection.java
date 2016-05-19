package com.collections.set;

import com.models.Product;
import com.models.User;
import com.util.SharedMethods;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by echavez on 5/19/16.
 */
public class SortedSetCollection extends SharedMethods{

    SortedSet<Product> items = new TreeSet<Product>();

    public SortedSetCollection(int size){
        super(size);
        this.items = (SortedSet) this.generateRandomBucket();
    }

    public Collection<Product> generateRandomBucket() {

        Product ipad = new Product("iPad", 500, new User("Jorge", 24, "jorge"));
        Product ipad2 = new Product("iPad2", 500, new User("Jorge", 24, "jorge"));
        Product ipad3 = new Product("iPad3", 500, new User("Jorge", 24, "jorge"));

        items.add(ipad);
        items.add(ipad2);
        items.add(ipad3);

        System.out.println(items.first());
        System.out.println(this.getItems());


        return items;

    }

    public void testCollection() {

    }

    public Collection<Product> getItems() {
        return this.items;
    }

}
