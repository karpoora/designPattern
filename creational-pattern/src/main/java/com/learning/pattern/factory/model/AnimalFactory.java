package com.learning.pattern.factory.model;

import java.util.HashMap;

/**
 * Created by krvh271 on 1/4/18.
 */
public class AnimalFactory {

    HashMap<String,String> animalMap=new HashMap();

    public AnimalFactory(){
        animalMap.put("bat","com.learning.pattern.factory.model.Bat");
        animalMap.put("cat","com.learning.pattern.factory.model.Cat");
        animalMap.put("dog","com.learning.pattern.factory.model.Dog");
        animalMap.put("elephant","com.learning.pattern.factory.model.Elephant");
    }

    public Animal getAnimal(String animalName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String NoAnimalClass = "com.learning.pattern.factory.model.NoAnimal";
        String animalClassFromMap = animalMap.get(animalName);
        String animalClassName = animalClassFromMap !=null? animalClassFromMap : NoAnimalClass;
        Animal animal=(Animal) Class.forName(animalClassName).newInstance();
        return animal;
    }
}
