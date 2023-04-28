package com.cook.yoriking.mysql.recipe;

import com.cook.yoriking.mysql.BaseTimeEntity;
import com.cook.yoriking.mysql.dish.Dish;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Recipe extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne
	@JoinColumn(name = "dish_id")
	private Dish dish;
}
