package com.tarjetaucoapi.tarjetaucoapi.repositories.user;

import com.tarjetaucoapi.tarjetaucoapi.domains.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface IUserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.userName = ?1")
    User findByUsername(String username);
}
