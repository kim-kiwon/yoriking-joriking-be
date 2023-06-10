package com.cook.yoriking.dish.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.dish.mapper.DishMapper;
import com.cook.yoriking.mysql.dish.DishRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DishService {
	private final DishRepository dishRepository;

	@Transactional(readOnly = true)
	public List<DishResponseDto> findAllDishes() {
		return dishRepository
			.findAll()
			.stream()
			.map(DishMapper.INSTANCE::entityToResponseDto)
			.collect(Collectors.toList());
	}
}
