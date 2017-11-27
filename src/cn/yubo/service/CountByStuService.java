package cn.yubo.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import cn.yubo.dao.CountByStuDao;

public class CountByStuService {
	CountByStuDao csd = new CountByStuDao();
	public List<Map<String, Object>> count(String stuId, String name) throws SQLException {
		if(StringUtils.isNotBlank(stuId)&StringUtils.isNotBlank(name)){
			return csd.queryByStuId(stuId);
		}else if(StringUtils.isNotBlank(stuId)&StringUtils.isBlank(name)){
			return csd.queryByStuId(stuId);
		}else if(StringUtils.isBlank(stuId) & StringUtils.isNotBlank(name)){
			return csd.queryByname(name);
		}
		return null;
		
	}

}
