package com.cook.yoriking.dish.dto;

import com.cook.yoriking.mysql.dish.Dish;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DishResponseDto {
	private Long id;

	private String dishName;

	private String dishImageUrl;

	private String dishExplain;

	private String dishTip;

	public static DishResponseDto of(Dish dish) {
		return DishResponseDto.builder()
			.id(dish.getId())
			.dishName(dish.getDishName())
			.dishImageUrl(dish.getDishImageUrl())
			.dishExplain(dish.getDishExplain())
			.dishTip(dish.getDishTip())
			.build();
	}
}
