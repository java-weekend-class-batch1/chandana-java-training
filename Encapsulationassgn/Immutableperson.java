package com.training.Encapsulationassgn;


import java.time.LocalDate;
import java.util.Objects;

final class Person {

    private final String name;
    private final LocalDate dateOfBirth;
    private final String idNumber;

    public Person(String name, LocalDate dateOfBirth, String idNumber) {
        if (name == null || idNumber == null || dateOfBirth == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }

        this.name = name;
        this.dateOfBirth = dateOfBirth; // LocalDate is immutable
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;
        return name.equals(p.name) &&
               dateOfBirth.equals(p.dateOfBirth) &&
               idNumber.equals(p.idNumber);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, idNumber);
    }

    @Override
    public String toString() {
        return "Person{name='" + name +
               "', dob=" + dateOfBirth +
               ", id='" + idNumber + "'}";
    }
}

public class Immutableperson {
    public static void main(String[] args) {

        Person p = new Person("Chandana", LocalDate.of(2003, 5, 10), "ID27");

        System.out.println(p);

        System.out.println("Name: " + p.getName());
        System.out.println("DOB: " + p.getDateOfBirth());
        System.out.println("ID: " + p.getIdNumber());
    }
}