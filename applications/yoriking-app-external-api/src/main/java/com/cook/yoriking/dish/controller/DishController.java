package com.cook.yoriking.dish.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cook.yoriking.core.model.ApiResult;
import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.dish.service.DishService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "dish", description = "요리 관련 API")
@RequestMapping("/v1/dish")
@RequiredArgsConstructor
@RestController
public class DishController {
	private final DishService dishService;

	@Operation(summary = "모든 요리 조회", description = "모든 요리를 페이징 조회합니다.")
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "ok"),
		@ApiResponse(responseCode = "400", description = "client error", content = @Content),
		@ApiResponse(responseCode = "404", description = "not found", content = @Content),
		@ApiResponse(responseCode = "500", description = "server error", content = @Content)})
	@GetMapping
	private ApiResult<Page<DishResponseDto>> findAll(
		@Parameter(description = "페이징 번호") @RequestParam(defaultValue = "0") int pageNum,
		@Parameter(description = "한 페이지 크기") @RequestParam(defaultValue = "30") int pageSize
	) {
		return ApiResult.success(dishService.findAll(pageNum, pageSize));
	}

}
