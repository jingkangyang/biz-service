package com.yjk.biz.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yjk.biz.dto.ResultDto;

@FeignClient(name="biz-service",fallback=DemoFeignServiceHystrix.class)
public interface DemoFeignService {
	@GetMapping(value="/demo/selectDemo")
	public ResultDto<String> selectDemo(@RequestParam("applCde") String applCde);

	@GetMapping(value="/demo/selectDemo2")
	public ResultDto<String> selectDemo2(@RequestParam("applCde") String applCde);
	
	@GetMapping(value="/demo/selectDemo3")
	public ResultDto<String> selectDemo3(@RequestParam("applCde") String applCde);
	
}
