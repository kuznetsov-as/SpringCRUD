package ru.kuznetsov.spring.dao;

import org.springframework.stereotype.Component;
import ru.kuznetsov.spring.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class PersonDAO {
    private final List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person("Tom"));
        people.add(new Person("Matt"));
        people.add(new Person("Tony"));
        people.add(new Person("Sonya"));
        people.add(new Person("Max"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(UUID id) {
        return people.stream().filter(person -> person.getId().equals(id)).findAny().orElse(null);
    }
}
