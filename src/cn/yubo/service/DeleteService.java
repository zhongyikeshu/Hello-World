package cn.yubo.service;

import java.sql.SQLException;

import cn.yubo.dao.DeleteDao;

public class DeleteService {
	
	DeleteDao dd = new DeleteDao();
	public void delete(String stuId, String className) throws SQLException {
		dd.delete(stuId,className);
		
	}

}
