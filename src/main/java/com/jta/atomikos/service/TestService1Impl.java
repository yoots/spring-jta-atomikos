/*
 * Copyright (c) 2013 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 * 
 * TestService1Impl.java
 */
package com.jta.atomikos.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jta.atomikos.dao.TestDao1;
import com.jta.atomikos.dao.TestDao2;

/**
 * 이 클래스는... 
 * @author yoots
 *
 * Created on 2013. 11. 29.
 */
@Service
public class TestService1Impl implements TestService1 {

	@Autowired
	TestDao1 testDao1;

	@Autowired
	TestDao2 testDao2;

	/* (non-Javadoc)
	 * @see com.jta.jboss.service.TestService1#getList(java.util.Map)
	 */
	public List<Map> getList(Map map) {
		// TODO Auto-generated method stub
		return testDao1.getList(map);
	}

	/* (non-Javadoc)
	 * @see com.jta.jboss.service.TestService1#setInsert(java.util.Map)
	 */
	public void insertBoard(Map map) {
		
		// TODO Auto-generated method stub
		testDao1.setInsert(map);
		
	}

	/* (non-Javadoc)
	 * @see com.jta.atomikos.service.TestService1#insertAllBoard(java.util.Map)
	 */
	public void insertAllBoard(Map map) {
		// TODO Auto-generated method stub
		
		testDao1.setInsert(map);
		testDao2.setInsert2(map);
	}
	
}
