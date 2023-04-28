package com.cook.yoriking.mysql.dish;

import com.cook.yoriking.mysql.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String dishName;

	@Column
	private String dishImageUrl;

	@Column
	private String dishExplain;

	@Column
	private String dishTip;
}
