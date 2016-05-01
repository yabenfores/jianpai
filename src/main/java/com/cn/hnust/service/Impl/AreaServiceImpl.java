package com.cn.hnust.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.AreaDao;
import com.cn.hnust.pojo.Area;
import com.cn.hnust.service.AreaService;
@Service("/areaSercie")
public class AreaServiceImpl implements AreaService
{
	@Resource
	private AreaDao areaDao;
	@Override
	public Area selectone(int id) {
		// TODO Auto-generated method stub
		return areaDao.selectByPrimaryKey(id);
	}
	
}
