package com.ncs.library.bean;


/*
 * This Pojo is used to send Response as request reply
 */
public class ResponseBean {
	private Boolean status;
	private String message = "Something Went Wrong!!!";
	public ResponseBean() {
		
	}
	public ResponseBean(Boolean status, String message) {
		this.status = status;
		this.message = message;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}