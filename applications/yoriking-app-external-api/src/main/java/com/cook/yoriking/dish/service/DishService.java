package com.cook.yoriking.dish.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cook.yoriking.dish.dto.DishResponseDto;
import com.cook.yoriking.mysql.dish.DishRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DishService {
	private final DishRepository dishRepository;

	@Transactional(readOnly = true)
	public Page<DishResponseDto> findAll(int pageNum, int pageSize) {
		// 기본정렬: id 오름차순
		PageRequest pageRequest = PageRequest.of(pageNum, pageSize, Sort.by("id").ascending());

		return dishRepository
			.findAll(pageRequest)
			.map(DishResponseDto::of);
	}
}
