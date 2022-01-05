package com.umar.apps.batchprocessing;

import java.util.Objects;

public record Person(String lastName, String firstName) {

    public Person {
        Objects.requireNonNull(lastName, "lastName is required");
        Objects.requireNonNull(firstName, "firstName is required");
    }

    public static Person of(String lastName, String firstName) {
        return new Person(lastName, firstName);
    }
}
