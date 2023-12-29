package com.pockocmoc;

import com.google.gson.Gson;

public class MainGson {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Petrov", 30);

        Gson gson = new Gson();

        String json = gson.toJson(person);
        System.out.println(json);

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson.getFirstName());
        System.out.println(deserializedPerson.getLastName());
        System.out.println(deserializedPerson.getAge());
    }
}
