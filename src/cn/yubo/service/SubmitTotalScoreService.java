package cn.yubo.service;

import java.sql.SQLException;

import cn.yubo.dao.SubmitTotalScoreDao;

public class SubmitTotalScoreService {
	
	SubmitTotalScoreDao ssd = new SubmitTotalScoreDao(); 
	public void save(String stuId, String totalScore, String avgScore) throws NumberFormatException, SQLException {
		ssd.save(stuId,totalScore,avgScore);
	}

}
