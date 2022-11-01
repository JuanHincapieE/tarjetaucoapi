package com.tarjetaucoapi.tarjetaucoapi.services.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;

import java.util.List;

public interface IPersonService {

    List<Person> findAll();

    Person findById(int id);

    Person save(Person person);

    void delete(int id);
}