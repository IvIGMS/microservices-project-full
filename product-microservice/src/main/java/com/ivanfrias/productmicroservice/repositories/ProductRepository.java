package com.ivanfrias.productmicroservice.repositories;

import com.ivanfrias.productmicroservice.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
