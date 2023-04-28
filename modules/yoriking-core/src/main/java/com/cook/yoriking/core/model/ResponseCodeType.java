package com.cook.yoriking.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeType {
	SUCCESS(200, "1000"),
	INVALID_INPUT(400, "4001"),
	NOT_FOUND(404, "4002"),
	;

	private int httpStatus;
	private String businessCode;
}
