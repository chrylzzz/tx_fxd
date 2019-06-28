package com.lnsoft.bd.fk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.lnsoft.bd.fk.service.DemoDataDbService;

@Configuration
public class BatchDataConfig {
	/**
	 * 初始化bean 完成批量插入bean线程的开启
	 * @return
	 */
	@Bean(initMethod="startThread")
	public DemoDataDbService demoDataDbService() {
		return new DemoDataDbService();
	}
}
