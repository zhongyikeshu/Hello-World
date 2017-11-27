package cn.yubo.dao;

import java.sql.SQLException;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.yubo.utils.DataSourceUtils;

public class DeleteDao {

	public void delete(String stuId, String className) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql1 = "select classId from kecheng where className = ?";
		
		String sql2 = "delete from xuanke where stuId = ? and classId = ?";
		
		String classId = (String) runner.query(sql1, new ScalarHandler(),className);
		runner.update(sql2, stuId,classId);
		 
		
	}

}
