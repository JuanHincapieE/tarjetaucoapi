package com.tarjetaucoapi.tarjetaucoapi.services.person;


import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;
import com.tarjetaucoapi.tarjetaucoapi.repositories.person.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonRepository personRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() { return (List<Person>) personRepository.findAll(); }

    @Override
    @Transactional(readOnly = true)
    public Person findById(int id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Person save(Person person) { return personRepository.save(person);
    }

    @Override
    @Transactional
    public void delete(int id) {
        personRepository.deleteById(id);
    }


}
