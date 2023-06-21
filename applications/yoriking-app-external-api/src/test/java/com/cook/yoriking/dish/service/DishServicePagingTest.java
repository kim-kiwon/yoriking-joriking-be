package com.cook.yoriking.dish.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.cook.yoriking.dish.dto.DishResponseDto;

@SpringBootTest
class DishServicePagingTest {
	@Autowired
	DishService dishService;

	@Test
	@DisplayName("Dish 페이징 기반 전체조회 성공 테스트")
	void Dish_페이징_기반_전체조회_성공_테스트() {
		// given
		int PAGE_NUM = 0;
		int PAGE_SIZE = 3;

		// when
		Page<DishResponseDto> response = dishService.findAll(PAGE_NUM, PAGE_SIZE);

		// then
		assertThat(response.getContent().get(0)).isNotNull();
		assertThat(response.getContent().get(1)).isNotNull();
		assertThat(response.getContent().get(2)).isNotNull();
		assertThatThrownBy(() -> response.getContent().get(3))
			.isInstanceOf(IndexOutOfBoundsException.class);
		assertThat(response.getPageable().getSort()).isEqualTo(Sort.by("id").ascending());
		assertThat(response.getPageable().getPageNumber()).isEqualTo(PAGE_NUM);
		assertThat(response.getPageable().getPageSize()).isEqualTo(PAGE_SIZE);
	}
}