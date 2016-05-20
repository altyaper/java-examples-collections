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


        ArrayListCollection arraylist = new ArrayListCollection(2);
        arraylist.testCollection();

        LinkedListCollection linkedlist = new LinkedListCollection(2);
        linkedlist.testCollection();

        HashSetCollection hashset = new HashSetCollection(2);
        hashset.testCollection();

        TreeSetCollection treeset = new TreeSetCollection(2);
        treeset.testCollection();

        EnumSetCollection enumset = new EnumSetCollection(2);
        enumset.testCollection();


    }
}
