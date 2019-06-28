package com.lnsoft.bd.fk.controller;

import com.lnsoft.bd.fk.mapper.TXczyTxzyMapper;
import com.lnsoft.bd.fk.po.TXczyTxzy;
import com.lnsoft.bd.fk.resultVo.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/txzy")
public class XczyController {

	
	@Autowired
	private TXczyTxzyMapper tXczyTxzyMapper;

	@PostMapping("/addTxzy")
	public ResponseData addTxzyt(@RequestBody TXczyTxzy txczyTxzy){		
		int i = tXczyTxzyMapper.insert(txczyTxzy);
		return ResponseData.ok();
	}

	@GetMapping("/selectTxzy")
	public ResponseData selectTxzy(@RequestParam(value = "objId") String objId){

		TXczyTxzy tXczyTxzy = tXczyTxzyMapper.selectByPrimaryKey(objId);
		return ResponseData.ok(tXczyTxzy);
	}

}
