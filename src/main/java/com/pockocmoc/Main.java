package com.pockocmoc;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marat", "Sabirov", 40);
        System.out.println(person);
        Person person2 = new Person("Marat", "Sabirov", 40);
        boolean res = person2.equals(person);
        System.out.println(res);

        boolean hashResult = person2.hashCode() == person.hashCode();
        System.out.println(hashResult);

    }
}
