package com.cook.yoriking.core.model;

import lombok.Getter;

@Getter
public class ApiResponse<T> {
	private boolean success;
	private String businessCode;
	private T result;
	private String errorMsg; // 에러시에만 사용

	public static <T> ApiResponse<T> success(T result) {
		ApiResponse<T> apiResponse = new ApiResponse<>();
		apiResponse.success = true;
		apiResponse.businessCode = ResponseCodeType.SUCCESS.getBusinessCode();
		apiResponse.result = result;
		return apiResponse;
	}

	public static ApiResponse<Void> fail(String businessCode, String errorMsg) {
		ApiResponse<Void> apiResponse = new ApiResponse<>();
		apiResponse.success = false;
		apiResponse.businessCode = businessCode;
		apiResponse.errorMsg = errorMsg;
		return apiResponse;
	}
}
