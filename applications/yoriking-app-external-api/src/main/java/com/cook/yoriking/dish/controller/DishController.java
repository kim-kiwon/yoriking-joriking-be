package com.cook.yoriking.dish.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cook.yoriking.core.model.ApiResult;
import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.dish.service.DishService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class DishController {
	private final DishService dishService;

	@GetMapping("/v1/dish")
	private ApiResult<List<DishResponseDto>> findAllDishes() {
		return ApiResult.success(dishService.findAllDishes());
	}

}
