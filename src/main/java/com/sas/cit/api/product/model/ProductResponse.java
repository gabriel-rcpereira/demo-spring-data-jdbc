package com.sas.cit.api.product.model;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private long id;
    private String name;
}
