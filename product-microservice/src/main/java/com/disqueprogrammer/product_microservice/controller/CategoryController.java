package com.disqueprogrammer.product_microservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
@RequestMapping("api/categories")
public class CategoryController {
    @Value("${app.testProperty}")
    private String testProperty;

    private String getTestProperty() {
        return this.testProperty;
    }
}
