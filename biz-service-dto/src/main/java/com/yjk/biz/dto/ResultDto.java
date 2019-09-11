/**
 * 
 */
package com.yjk.biz.dto;

/**
 * @author Administrator
 *
 */
public class ResultDto<T> {
	private String code;
	private long total;
	private String message;
	private T data;
	
	public ResultDto() {
		super();
	}
	
	public ResultDto(String code,long total,String message,T data) {
		super();
		this.code = code;
		this.total = total;
		this.message = message;
		this.data = data;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
