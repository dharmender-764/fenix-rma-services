package com.fenix.ecom.returns.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Response status for success/failure with error list if any")
public class ResponseMessageStatus {

	@ApiModelProperty(value = "Success/Failure flag", required = true)
	boolean success = false;

	@ApiModelProperty(value = "List of errors in case of failure", required = true)
	private String error;

	public ResponseMessageStatus() {
		
	}
	
	public ResponseMessageStatus(String error) {
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

}
