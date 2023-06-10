package com.cook.yoriking.dish.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.mysql.dish.Dish;

@Mapper
public interface DishMapper {
	DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);

	DishResponseDto entityToResponseDto(Dish dish);
}
