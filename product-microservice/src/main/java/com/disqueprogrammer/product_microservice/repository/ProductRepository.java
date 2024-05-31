package com.disqueprogrammer.product_microservice.repository;

import com.disqueprogrammer.product_microservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
