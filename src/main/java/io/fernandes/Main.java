package io.fernandes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Peter", Gender.MALE),
                new Person("Matt", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Mark", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Patricia", Gender.FEMALE)
        );

        people.forEach(
                System.out::println
        );
    }

    static class Person {
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
