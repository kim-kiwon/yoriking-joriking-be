package com.cook.yoriking.mysql.dishingredient;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface DishRepositoryRepository extends JpaRepository<DishIngredient, Long> {
}
