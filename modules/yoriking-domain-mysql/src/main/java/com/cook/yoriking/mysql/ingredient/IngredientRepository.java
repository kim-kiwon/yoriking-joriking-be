package com.cook.yoriking.mysql.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cook.yoriking.mysql.dishingredient.DishIngredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
