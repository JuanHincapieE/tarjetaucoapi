package com.tarjetaucoapi.tarjetaucoapi.repositories.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT nombre  FROM usuario WHERE usuario.id = ")

    List<Car> getCarsByModel(@Param("model") String model);

}
