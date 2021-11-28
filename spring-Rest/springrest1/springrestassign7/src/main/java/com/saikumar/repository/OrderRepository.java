package com.saikumar.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saikumar.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}