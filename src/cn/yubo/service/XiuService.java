package cn.yubo.service;

import java.sql.SQLException;

import cn.yubo.dao.XiuDao;

public class XiuService {

	
	XiuDao xd = new XiuDao();
	public void xiu(String stuName, String className, String score) throws SQLException {
		xd.xiu(stuName,className,score);
		
	}

}
