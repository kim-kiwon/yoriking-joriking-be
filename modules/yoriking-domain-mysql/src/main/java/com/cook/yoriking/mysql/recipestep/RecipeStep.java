package com.cook.yoriking.mysql.recipestep;

import com.cook.yoriking.mysql.BaseTimeEntity;
import com.cook.yoriking.mysql.recipe.Recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RecipeStep extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private int stepNumber;

	@Column
	private String recipeText;

	@Column
	private String recipeImageUrl;

	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;
}
