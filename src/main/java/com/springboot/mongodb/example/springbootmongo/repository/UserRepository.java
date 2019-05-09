package com.springboot.mongodb.example.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
