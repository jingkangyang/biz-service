package com.yjk.biz.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yjk.biz.dto.ResultDto;
import com.yjk.biz.service.DemoService;

import io.swagger.annotations.Api;

@Api(value="Demo查询原子微服务",tags="Demo查询原子微服务")
@RestController
@RequestMapping("/demo")
public class DemoResources {
	
	@Autowired
	private DemoService demoService;
	
	/**原子微服务demo1
	 * @param applCde
	 * @return
	 */
	@GetMapping("/selectDemo")
	public ResultDto<String> selectDemo(@RequestParam("applCde") String applCde){
		String result = null;
		try {
			result = demoService.selectDemo(applCde);
		} catch (Exception e) {
			return new ResultDto<String>("-1",0,"原子微服务调用失败！",null);
		}
		if(result != null) {
			return new ResultDto<String>("1", 1, "原子微服务调用成功！", result);
		}
		return new ResultDto<String>("1", 1, "原子微服务调用成功！", "0");
	}
	
	/**原子微服务demo2
	 * @param applCde
	 * @return
	 */
	@GetMapping("/selectDemo2")
	public ResultDto<String> selectDemo2(@RequestParam("applCde") String applCde){
		String result = null;
		try {
			result = demoService.selectDemo2(applCde);
		} catch (Exception e) {
			return new ResultDto<String>("-1",0,"原子微服务调用失败！",null);
		}
		if(result != null) {
			return new ResultDto<String>("1", 1, "原子微服务调用成功！", result);
		}
		return new ResultDto<String>("1", 1, "原子微服务调用成功！", "0");
	}
	
	/**原子微服务demo3
	 * @param applCde
	 * @return
	 */
	@GetMapping("/selectDemo3")
	public ResultDto<String> selectDemo3(@RequestParam("applCde") String applCde){
		String result = null;
		try {
			result = demoService.selectDemo3(applCde);
		} catch (Exception e) {
			return new ResultDto<String>("-1",0,"原子微服务调用失败！",null);
		}
		if(result != null) {
			return new ResultDto<String>("1", 1, "原子微服务调用成功！", result);
		}
		return new ResultDto<String>("1", 1, "原子微服务调用成功！", "0");
	}
}
