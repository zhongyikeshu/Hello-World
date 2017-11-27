package cn.yubo.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import cn.yubo.dao.QueryScoreDao;

public class QueryScoreService {
	
	QueryScoreDao qsd = new QueryScoreDao();
	public List query(String stuId, String className) throws SQLException {
		
		if(StringUtils.isNotBlank(stuId)&StringUtils.isNotBlank(className)){
			return qsd.query(stuId,className);
		}else if(StringUtils.isNotBlank(stuId)&StringUtils.isBlank(className)){
			return qsd.queryByStuId(stuId);
		}else if(StringUtils.isBlank(stuId) & StringUtils.isNotBlank(className)){
			return qsd.queryByClassName(className);
		}else if(StringUtils.isBlank(stuId) & StringUtils.isBlank(className)){
			return qsd.queryAll();
		}
		return null;
		
		
	}

}
