package com.springboot.dao.impl;

import com.lancer.Interface.SysLogMapper;
import com.lancer.bean.SysLog;
import com.springboot.dao.SysLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SysLogDaoImp implements SysLogDao {

	@Autowired
	private SysLogMapper mapper;

	@Override
	public void saveSysLog(SysLog syslog) {
		mapper.insert(syslog);
	}

}
