package com.paiva.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paiva.sbmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
