package com.tarjetaucoapi.tarjetaucoapi.repositories.user;

import com.tarjetaucoapi.tarjetaucoapi.domains.user.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Integer> {
}
