package com.main;

import com.collections.list.ArrayListCollection;
import com.collections.list.LinkedListCollection;
import com.collections.set.EnumSetCollection;
import com.collections.set.HashSetCollection;
import com.collections.set.TreeSetCollection;

/**
 * Created by echavez on 5/18/16.
 */
public class Main {

    public static void main(String args[]) {

        ArrayListCollection arraylist = new ArrayListCollection(5);
        arraylist.testCollection();

        LinkedListCollection linkedlist = new LinkedListCollection(5);
        linkedlist.testCollection();

        HashSetCollection hashset = new HashSetCollection(5);
        hashset.testCollection();

        TreeSetCollection treeset = new TreeSetCollection(5);
        treeset.testCollection();

        EnumSetCollection enumset = new EnumSetCollection(5);
        enumset.testCollection();


    }
}
