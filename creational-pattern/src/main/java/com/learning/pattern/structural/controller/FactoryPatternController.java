package com.learning.pattern.structural.controller;

import com.learning.pattern.factory.model.AnimalFactory;
import com.learning.pattern.structural.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by krvh271 on 1/4/18.
 */

@RestController
public class FactoryPatternController {

    @Autowired
    FactoryService factoryService;

    @GetMapping("factory/{animal}")
    public String getSound(@PathVariable String animal) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        return factoryService.getSound(animal);
    }

    @Bean
    AnimalFactory getAnimalFactory(){
       return new AnimalFactory();
    }
}
