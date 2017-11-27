package cn.yubo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.yubo.utils.CommonsUtils;
import cn.yubo.utils.DataSourceUtils;

public class AddDao {

	public void add(String stuName, String className, String score) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql1 = "select stuId from student where name = ?";
		String sql2 = "select classId from kecheng where className = ?";
		String sql3 = "select * from xuanke where stuId = ? and classId = ?";
		String sql4 = "insert into xuanke values(?,?,?,?)";
		String sql5 = "update xuanke set score = ? where stuId = ? and classId = ?";
		
		
		String stuId = (String) runner.query(sql1, new ScalarHandler(),stuName);
		String classId = (String) runner.query(sql2, new ScalarHandler(),className);
		List<Map<String, Object>> list = runner.query(sql3, new MapListHandler(), stuId,classId);
		if(list.isEmpty()){
			runner.update(sql4,CommonsUtils.getUUID(),stuId,classId,Integer.parseInt(score) );
		}else{
			runner.update(sql5,Integer.parseInt(score), stuId,classId);
		}
		
	}

}
