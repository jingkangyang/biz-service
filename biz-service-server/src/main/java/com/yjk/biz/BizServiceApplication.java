package com.yjk.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.yjk.biz")
@EnableDiscoveryClient
@MapperScan(basePackages="com.yjk.biz.mapper")
public class BizServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BizServiceApplication.class, args);
	}
}
