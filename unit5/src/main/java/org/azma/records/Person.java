package org.azma.records;

import java.time.LocalDate;
import java.util.Objects;

public record Person(String name, int age, LocalDate dateOfBirth) {

        // Custom constructor with validation
        public Person {
            if (age < 0)
                throw new IllegalArgumentException("Age cannot be negative");

            if (dateOfBirth.isAfter(LocalDate.now()))
                throw new IllegalArgumentException("Date of birth cannot be in the future");

        }

        // Static factory method
        public static Person of(String name, int age, LocalDate dateOfBirth) {
            return new Person(name, age, dateOfBirth);
        }

        // Additional methods
        public int calculateYearsUntilRetirement() {
            int retirementAge = 65;
            return retirementAge - this.age;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return age == person.age &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(dateOfBirth, person.dateOfBirth);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age, dateOfBirth);
        }
        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + "]";
        }
    }