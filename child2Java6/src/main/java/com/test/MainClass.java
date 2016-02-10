package com.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by NWM on 10/02/2016.
 */
class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    List<Person> persons =
            Arrays.asList(
                    new Person("Nathan", 36),
                    new Person("Harry", 26),
                    new Person("Isabell", 56),
                    new Person("Sally", 76),
                    new Person("Pauline", 76),
                    new Person("Peter", 16));

    List<Person> filtered =
            persons
                    .stream()
                    //the lambda expression below will fail and Gradle will act appropriately. 
                    .filter(p -> p.name.startsWith("P"))
                    .collect(Collectors.toList());

           System.out.println(filtered);

}
