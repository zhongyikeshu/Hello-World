package cn.yubo.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import cn.yubo.utils.DataSourceUtils;

public class SubmitTotalScoreDao {

	public void save(String stuId, String totalScore, String avgScore) throws NumberFormatException, SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update student set totalscore = ? ,avgscore = ? where stuId = ?";
		runner.update(sql,Integer.parseInt(totalScore),Integer.parseInt(avgScore), stuId);
	}

}
