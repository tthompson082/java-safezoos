package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.view.AnimalCountByZoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal findByAnimaltype(String type);

    @Query(value = "SELECT a.ANIMALTYPE, COUNT(z.ZOOID) as ZOOCOUNT FROM ANIMAL a JOIN ZOOANIMALS z ON a.ANIMALID = z.ANIMALID GROUP BY a.ANIMALTYPE", nativeQuery = true)
    ArrayList<AnimalCountByZoo> getZooCount();
}
