package com.tarjetaucoapi.tarjetaucoapi.repositories.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Integer> {


}
