package com.util;

import com.models.Product;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * Created by echavez on 5/18/16.
 */
public abstract class SharedMethods<T> {

    protected int size = 5;

    public SharedMethods(int size){
        this.size = size;
    }

    abstract public Collection<Product> generateRandomBucket();

    abstract public void testCollection();

    abstract public Collection<T> getItems();



}
