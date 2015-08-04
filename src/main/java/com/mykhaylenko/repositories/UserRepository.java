package com.mykhaylenko.repositories;

import com.mykhaylenko.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pavlo.mykhaylenko on 8/4/2015.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByusername(String username);
}
