package cn.yubo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.yubo.utils.DataSourceUtils;



public class QueryScoreDao {

	public List query(String stuId, String className) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select s.stuId,s.name,k.className,x.score from student s,xuanke x,kecheng k where s.stuId = x.stuId "
				+ "and k.classId = x.classId and s.stuId = ? and k.className = ?";
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), stuId,className);
		 return query;
	}

	public List queryByStuId(String stuId) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select s.stuId,s.name,k.className,x.score from student s,xuanke x,kecheng k where s.stuId = x.stuId "
				+ "and k.classId = x.classId and s.stuId = ?";
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), stuId);
		 return query;
		
	}

	public List queryByClassName(String className) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select s.stuId,s.name,k.className,x.score from student s,xuanke x,kecheng k where s.stuId = x.stuId "
				+ "and k.classId = x.classId and k.className = ?";
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler(), className);
		 return query;
	}

	public List queryAll() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select s.stuId,s.name,k.className,x.score from student s,xuanke x,kecheng k where s.stuId = x.stuId "
				+ "and k.classId = x.classId";
	
		 List<Map<String, Object>> query = runner.query(sql, new MapListHandler());
		 return query;
	}

}
