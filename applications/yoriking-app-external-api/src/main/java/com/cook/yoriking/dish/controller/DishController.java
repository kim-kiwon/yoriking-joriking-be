package com.cook.yoriking.dish.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cook.yoriking.core.model.ApiResult;
import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.dish.service.DishService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DishController {
	private final DishService dishService;

	@GetMapping("/v1/dish")
	private ApiResult<Page<DishResponseDto>> findAll(
		@RequestParam(defaultValue = "0") int pageNum,
		@RequestParam(defaultValue = "30") int pageSize
	) {
		return ApiResult.success(dishService.findAll(pageNum, pageSize));
	}

}
