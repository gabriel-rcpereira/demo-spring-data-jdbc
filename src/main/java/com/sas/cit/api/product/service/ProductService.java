package com.sas.cit.api.product.service;

import com.sas.cit.api.product.model.ProductResponse;
import com.sas.cit.api.product.model.ProductVo;
import com.sas.cit.entity.model.Product;
import com.sas.cit.entity.repository.ProductRepository;
import com.sas.cit.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductResponse retrieveProductById(long id) throws BusinessException {
        return repository.findById(id)
                .map(this::buildResponse)
                .orElseThrow(() -> new BusinessException("Product not found."));
    }

    public ProductResponse createProduct(ProductVo productVo) {
        Product product = repository.save(buildNewProduct(productVo));
        return buildResponse(product);
    }

    private ProductResponse buildResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .build();
    }

    private Product buildNewProduct(ProductVo productVo) {
        return Product.builder()
                .name(productVo.getName())
                .build();
    }
}
