package com.data_from_sql.data_from_sql.repositories;

import com.data_from_sql.data_from_sql.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByName(String name);

    List<User> findUserByNameIgnoreCase(String name);
}
