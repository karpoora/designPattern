package com.learning.pattern.factory.model;

import java.util.HashMap;

/**
 * Created by krvh271 on 1/4/18.
 */
public class AnimalFactory {

    HashMap<String,String> animalMap=new HashMap();

    public AnimalFactory(){
        animalMap.put("bat","com.learning.pattern.model.factory.Bat");
        animalMap.put("cat","com.learning.pattern.model.factory.Cat");
        animalMap.put("dog","com.learning.pattern.model.factory.Dog");
        animalMap.put("elephant","com.learning.pattern.model.factory.Elephant");
    }

    public Animal getAnimal(String animalName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Animal animal=(Animal) Class.forName(animalMap.get(animalName)).newInstance();
        return animal;
    }
}
