package cn.yubo.service;

import java.sql.SQLException;
import java.util.List;

import cn.yubo.dao.CountByClassDao;

public class CountByClassService {
	
	CountByClassDao ccd = new CountByClassDao();
	public List count(String className) throws SQLException {
		return ccd.count(className);
		
	}

}
