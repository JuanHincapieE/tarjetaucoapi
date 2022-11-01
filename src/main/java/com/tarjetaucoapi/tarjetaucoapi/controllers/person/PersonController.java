package com.tarjetaucoapi.tarjetaucoapi.controllers.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;
import com.tarjetaucoapi.tarjetaucoapi.services.person.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @GetMapping("/persons")
    public List<Person> index() { return (List<Person>) personService.findAll(); }
    @GetMapping("/persons/{id}")
    public Person show(@PathVariable int id){ return personService.findById(id); }

    @PostMapping("/persons")
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) {return personService.save(person);}

    @PutMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Person update(@RequestBody Person person, int id){
        Person currentPerson = personService.findById(id);

        currentPerson.setPersonalEmail(person.getPersonalEmail());
        return personService.save(currentPerson);
    }

    @DeleteMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {personService.delete(id); }



}
