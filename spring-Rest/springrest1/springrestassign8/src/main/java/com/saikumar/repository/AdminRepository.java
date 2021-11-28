package com.saikumar.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saikumar.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
