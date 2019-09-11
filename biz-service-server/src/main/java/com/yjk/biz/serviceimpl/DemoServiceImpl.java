package com.yjk.biz.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjk.biz.domain.Appl;
import com.yjk.biz.mapper.ApplMapper;
import com.yjk.biz.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	/*@Autowired
	private DemoMapper demoMapper;*/
	
	@Autowired
	private ApplMapper applMapper;
	
	public String selectDemo(String applCde) {
		Appl appl = new Appl();
		appl = applMapper.select(applCde);
		return appl.getName();
	}

	public String selectDemo2(String applCde) {
		return "原子服务调用查询结果2";
	}

	public String selectDemo3(String applCde) {
		return "原子服务调用查询结果3";
	}

}
