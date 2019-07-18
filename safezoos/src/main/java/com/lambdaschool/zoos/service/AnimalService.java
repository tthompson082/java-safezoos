package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.AnimalCountByZoo;
import com.lambdaschool.zoos.view.JustTheCount;

import java.util.ArrayList;

public interface AnimalService
{
    ArrayList<Animal> findAll();

    Animal findAnimalByType(String type);

    ArrayList<AnimalCountByZoo> getZooCount();
}
