package com.lnsoft.bd.fk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsoft.bd.fk.dao.DemoDao;
import com.lnsoft.bd.fk.domain.DemoBean;


@Service
public class DemoService {
	@Autowired 
	private DemoDao dao;
	
	public List<DemoBean> getList(){
		List<DemoBean> rList = new ArrayList<DemoBean>();
		List<Map<String, Object>> list = dao.getList();
		if(list!=null && list.size()>0) {
			for(Map<String, Object> map : list) {
				String id = map.get("id")==null ? "":map.get("id").toString();
				String value = map.get("id")==null ? "":map.get("id").toString();
				DemoBean bean = new DemoBean();
				bean.setId(id);
				bean.setValue(value);
				rList.add(bean);
			}
		}
		return rList;
	}
}
