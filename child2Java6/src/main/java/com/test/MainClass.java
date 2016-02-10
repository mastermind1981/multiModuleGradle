package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by NWM on 10/02/2016.
 */
public class MainClass {

    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + ": " + age;
        }
    }

    List<Person> persons =
            Arrays.asList(
                    new Person("Nathan", 36),
                    new Person("Harry", 26),
                    new Person("Isabelle", 56),
                    new Person("Sally", 76),
                    new Person("Pauline", 76),
                    new Person("Peter", 16));

    List<Person> filtered =
            persons
                    .stream()
                    //the lambda expression below will fail if Java 6 is set in build.gradle and Gradle will act appropriately.
                    .filter(p -> p.name.startsWith("P"))
                    .collect(Collectors.toList());

    public void run(){
        System.out.println(filtered);
    }

    public static void main(String[] args){
        new MainClass().run();
    }
}
