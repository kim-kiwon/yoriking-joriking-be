package com.cook.yoriking.core.exception;

import com.cook.yoriking.core.model.ResponseType;

public class NoDataException extends CustomException {
	public NoDataException(String message) {
		super(message);
	}

	@Override
	public ResponseType getResponseType() {
		return ResponseType.NOT_FOUND;
	}
}