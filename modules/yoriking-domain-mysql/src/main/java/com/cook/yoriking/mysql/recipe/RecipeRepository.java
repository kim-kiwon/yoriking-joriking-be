package com.cook.yoriking.mysql.recipe;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cook.yoriking.mysql.ingredient.Ingredient;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
