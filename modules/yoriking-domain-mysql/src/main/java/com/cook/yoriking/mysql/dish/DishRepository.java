package com.cook.yoriking.mysql.dish;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
	Page<Dish> findAll(Pageable pageable);
}
