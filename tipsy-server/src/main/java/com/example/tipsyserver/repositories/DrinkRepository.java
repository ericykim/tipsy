package com.example.tipsyserver.repositories;

import com.example.tipsyserver.models.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Integer>{
}
