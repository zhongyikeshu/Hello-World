package cn.yubo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.yubo.utils.DataSourceUtils;

public class CountByStuDao {

	public List<Map<String, Object>> queryByStuId(String stuId) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select sum(score) totalScore,max(score) maxScore,min(score) minScore,count(*) totalClass  from xuanke where stuId = ?";
				
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), stuId);
		 return query;
		
	}

	public List<Map<String, Object>> queryByname(String name) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select sum(x.score) totalScore,max(x.score) maxScore,min(x.score) minScore,count(x.*) from student s,xuanke x, where s.stuId = x.stuId "
				+ "and s.name = ?";
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), name);
		 return query;
	}

}
