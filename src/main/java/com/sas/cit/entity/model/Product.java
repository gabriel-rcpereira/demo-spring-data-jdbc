package com.sas.cit.entity.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Builder
@Table
public class Product {

    @Id
    private long id;
    private String name;
}


