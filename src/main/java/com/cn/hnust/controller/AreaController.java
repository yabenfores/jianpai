package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.Area;
import com.cn.hnust.service.AreaService;

@Controller
@RequestMapping("Area")
public class AreaController 
{
	@Resource
	private AreaService areaService;
	@RequestMapping("id")
	@ResponseBody
	public Area select(HttpServletRequest request)
	{
		return areaService.selectone(Integer.parseInt(request.getParameter("id")));
	}
}
