package com.lnsoft.bd.fk.controller;

import com.lnsoft.bd.fk.domain.DemoBean;
import com.lnsoft.bd.fk.resultVo.ResponseData;
import com.lnsoft.bd.fk.service.DemoDataDbService;
import com.lnsoft.bd.fk.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
public class DemoController {
	@Autowired 
	private DemoDataDbService batchService;
	
	@Autowired
	private DemoService Service;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@GetMapping("/")
	public ResponseData demoBeanList(){
		return ResponseData.ok();
	}
	
	@PostMapping("/")
	public ResponseData saveDemo(@RequestBody DemoBean bean) {

		return ResponseData.ok();
	}
	
	
	/**
	 * 远程调用示例
	 * @return
	 */
	@GetMapping("/apply")
	public Boolean apply() {
		RestTemplate client = restTemplateBuilder.build();
		DemoBean demoBean = new DemoBean();
		demoBean.setId(UUID.randomUUID().toString());
		demoBean.setValue(UUID.randomUUID().toString());
		Boolean resp = client.postForObject("http://localhost:28080/", demoBean, Boolean.class);
		return resp;
	}
	
}
