package com.cook.yoriking.core.exception;

import com.cook.yoriking.core.model.ResponseType;

public class InvalidInputException extends CustomException {
	public InvalidInputException(String message) {
		super(message);
	}

	@Override
	public ResponseType getResponseType() {
		return ResponseType.INVALID_INPUT;
	}
}
