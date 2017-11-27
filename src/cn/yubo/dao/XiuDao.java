package cn.yubo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.yubo.utils.DataSourceUtils;



public class XiuDao {

	public void xiu(String stuName, String className, String score) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql1 = "select stuId from student where name = ?";
		String sql2 = "select classId from kecheng where className = ?";
		String sql3 = "update xuanke set score = ? where stuId = ? and classId = ?";
		 
		String stuId = (String) runner.query(sql1, new ScalarHandler(),stuName);
		String classId = (String) runner.query(sql2, new ScalarHandler(),className);
		int update = runner.update(sql3,Integer.parseInt(score), stuId,classId);
		
		
	}

}
