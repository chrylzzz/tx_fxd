package com.lnsoft.bd.fk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lnsoft.bd.fk.dao.DemoDao;
import com.lnsoft.bd.fk.domain.DemoBean;
/**
 * 批量插入
 * @author liuh
 *
 */
public class DemoDataDbService extends DataDbService<DemoBean>{
	
	@Autowired
	private DemoDao dao;

	@Override
	public void dbService(List<DemoBean> list) {
		dao.saveList(list);
	}
	
}
