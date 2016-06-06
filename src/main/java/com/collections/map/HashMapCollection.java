package com.collections.map;

import com.models.Person;
import com.models.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by echavez on 5/20/16.
 */
public class HashMapCollection {

    private int size = 5;
    HashMap<Integer, Person> items = new HashMap<Integer, Person>();

    public HashMap<String, Product> generateRandomBucket() {

        Person p = new Person("jorge","chavez",23);
        Person p2 = new Person("jorge","chavez",24);

        Product product1 = new Product();

        this.items.put(p.hashCode(), p);
        this.items.put(p2.hashCode(), p2);


    return null;

    }

    public void testCollection() {

        this.printMap(this.items);

    }

    public HashMap<Integer, Person> getItems() {
        return this.items;
    }

    private void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
