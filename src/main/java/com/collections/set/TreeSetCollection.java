package com.collections.set;

import com.models.Product;
import com.models.User;
import com.util.SharedMethods;
import com.util.UsefullMethods;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by echavez on 5/18/16.
 */
public class TreeSetCollection extends SharedMethods {

    Set<Product> items = new TreeSet<Product>();

    public TreeSetCollection(int size) {
        super(size);
        this.items = (Set) this.generateRandomBucket();
    }

    public Collection<Product> generateRandomBucket() {

        User user = new User("Jorge", 24, "echavez@nearsoft.com");
        Product product = new Product("iPad", UsefullMethods.generateRandomPrice(0,900), user);
        Product product2 = new Product("iPod", UsefullMethods.generateRandomPrice(0,900), user);
        Product product3 = new Product("iMac", UsefullMethods.generateRandomPrice(0,900), user);

        //Duplicate not available, just one will be added.
        items.add(product2);
        items.add(product2);

        //Sort - Order DEFINED at the Product, implementing the Comparable<Product> interface.
        //This means that the TreeSet will be order by "price" as we defined.
        items.add(product);
        items.add(product3);

        return items;

    }

    public void testCollection() {
        Iterator i = items.iterator();
        while(i.hasNext()){
            Product p = (Product) i.next();
            System.out.println(p.getName());
        }

    }

    public Collection<Product> getItems() {
        return items;
    }


}
