package com.cook.yoriking.mysql.dish;

import java.util.ArrayList;
import java.util.List;

import com.cook.yoriking.mysql.BaseTimeEntity;
import com.cook.yoriking.mysql.dishingredient.DishIngredient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dish extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String dishName;

	@Column
	private String dishImageUrl;

	@Column
	private String dishExplain;

	@Column
	private String dishTip;

	@OneToMany(mappedBy = "dish")
	private List<DishIngredient> dishIngredients = new ArrayList<>();
}
