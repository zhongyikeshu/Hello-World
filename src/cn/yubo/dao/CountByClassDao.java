package cn.yubo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.yubo.utils.DataSourceUtils;

public class CountByClassDao {

	public List count(String className) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select sum(score) totalScore,max(score) maxScore,min(score) minScore,count(*) totalStu  from xuanke where classId = ?";
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), className);
		 return query;
		
		
	}

} 
