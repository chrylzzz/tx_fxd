package com.lnsoft.bd.fk.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lnsoft.bd.fk.domain.DemoBean;

@Repository
public class DemoDao {
	@Autowired
	private JdbcTemplate jdbc;
	/**
	 * 批量插入
	 * @param list
	 */
	public void saveList(final List<DemoBean> list) {
		String sql = "insert into demo(id,value) values(?,?)";
		jdbc.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				DemoBean bean = list.get(index);
				ps.setString(1, bean.getId());
				ps.setString(2, bean.getValue());
			}
			
			public int getBatchSize() {
				return list.size();
			}
		});
	}
	
	public List<Map<String, Object>> getList(){
		String sql = "select * from demo";
		return jdbc.queryForList(sql);
	}
	
}
