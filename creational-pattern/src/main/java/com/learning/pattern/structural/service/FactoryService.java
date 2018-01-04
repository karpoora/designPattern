package com.learning.pattern.structural.service;

import com.learning.pattern.factory.model.Animal;
import com.learning.pattern.factory.model.AnimalFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by krvh271 on 1/4/18.
 */
@Service
public class FactoryService {

    @Autowired
    AnimalFactory animalFactory;

    public String getSound(String animalName) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Animal animal=animalFactory.getAnimal(animalName);
        return animal.sound();
    }
}
