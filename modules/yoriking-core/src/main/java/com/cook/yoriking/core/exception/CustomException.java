package com.cook.yoriking.core.exception;

import com.cook.yoriking.core.model.ResponseType;

import lombok.Getter;

@Getter
public abstract class CustomException extends RuntimeException {
	public CustomException(String message) {
		super(message);
	}

	public abstract ResponseType getResponseType();
}
