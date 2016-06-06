package com.models;

/**
 * Created by echavez on 5/27/16.
 */
public class Person {

    private String firstName;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String lastName;
    private int age;

    @Override
    public int hashCode() {
        return firstName.hashCode() * lastName.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Person)) {
//            return false;
//        }
//
//        Person other = (Person) obj;
//
//        return firstName.equals(other.firstName) && lastName.equals(other.lastName) && age == other.age;
//    }



    public static void main(String[] args) {
        Person person = new Person("Jorge", "Chavez", 24);
        Person person1 = new Person("Jorge", "Chavez", 25);

        System.out.println(person.hashCode() == person1.hashCode());
        System.out.println(person.equals(person1));
    }
}
