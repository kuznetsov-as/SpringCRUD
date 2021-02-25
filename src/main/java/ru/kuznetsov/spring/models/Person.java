package ru.kuznetsov.spring.models;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Person {
    private UUID id;
    private String name;

    public Person(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
