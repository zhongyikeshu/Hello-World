package cn.yubo.service;

import java.sql.SQLException;

import cn.yubo.dao.AddDao;

public class AddService {
	
	AddDao ad = new AddDao();
	public void add(String stuName, String className, String score) throws SQLException {
		ad.add(stuName,className,score);
	}

}
