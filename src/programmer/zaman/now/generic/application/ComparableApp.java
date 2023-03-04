package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Arief", "Rancaekek"),
                new Person("Hilmi", "Cibinong"),
                new Person("Bagus","Sidoarjo")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
