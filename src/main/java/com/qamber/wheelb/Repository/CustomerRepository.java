package com.qamber.wheelb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qamber.wheelb.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
