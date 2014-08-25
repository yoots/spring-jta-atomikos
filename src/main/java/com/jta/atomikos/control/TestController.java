/*
 * Copyright (c) 2013 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 * 
 * TestController.java
 */
package com.jta.atomikos.control;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jta.atomikos.service.TestService1;
import com.jta.atomikos.service.TestService2;


/**
 * 이 클래스는... 
 * @author yoots
 *
 * Created on 2013. 12. 2.
 */
@Controller
@RequestMapping(value="/test/**")
public class TestController {

	@Autowired
	TestService1 testService1;
	
	@Autowired
	TestService2 testService2;
	
	
	@RequestMapping(value = "/Jta")
	public String board(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		
		System.out.println(testService1.getList(map));
		
		System.out.println(testService2.getList(map));
		
		map.put("no", "31");
		map.put("title", "테스트~~~~~!!!");
		map.put("thread", "31");
		map.put("position", "AA");
		
		try{
			testService1.insertBoard(map);
			testService2.insertBoard(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		map.put("no", "32");
		map.put("title", "테스트~~~~~!!!");
		map.put("thread", "32");
		map.put("position", "AA");
		
		try{
			testService1.insertAllBoard(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return "test";
	}
}
