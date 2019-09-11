package com.yjk.biz.client;

import org.springframework.stereotype.Component;

import com.yjk.biz.dto.ResultDto;

@Component
public class DemoFeignServiceHystrix implements DemoFeignService{

	public ResultDto<String> selectDemo(String applCde) {
		return new ResultDto<String>("-99", 0, "原子微服务发生熔断错误！", null);
	}

	public ResultDto<String> selectDemo2(String applCde) {
		return new ResultDto<String>("-99", 0, "原子微服务发生熔断错误！", null);
	}

	public ResultDto<String> selectDemo3(String applCde) {
		return new ResultDto<String>("-99", 0, "原子微服务发生熔断错误！", null);
	}

}
