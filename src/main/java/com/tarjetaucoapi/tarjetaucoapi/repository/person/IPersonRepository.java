package com.tarjetaucoapi.tarjetaucoapi.repository.person;

import com.tarjetaucoapi.tarjetaucoapi.domains.person.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT nombre  FROM usuario WHERE usuario.id = ")

    List<Car> getCarsByModel(@Param("model") String model);

}
