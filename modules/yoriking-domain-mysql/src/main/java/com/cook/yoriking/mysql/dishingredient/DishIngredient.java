package com.cook.yoriking.mysql.dishingredient;

import com.cook.yoriking.mysql.BaseTimeEntity;
import com.cook.yoriking.mysql.dish.Dish;
import com.cook.yoriking.mysql.ingredient.Ingredient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DishIngredient extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "dish_id")
	private Dish dish;

	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	private Ingredient ingredient;

	@Column
	private String ingredientAmount;
}
