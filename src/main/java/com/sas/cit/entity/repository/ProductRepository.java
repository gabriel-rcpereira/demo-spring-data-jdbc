package com.sas.cit.entity.repository;

import com.sas.cit.entity.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findById(long id);
}
