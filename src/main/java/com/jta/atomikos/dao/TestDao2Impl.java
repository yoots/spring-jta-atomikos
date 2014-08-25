/*
 * Copyright (c) 2013 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 * 
 * TestDao1Impl.java
 */
package com.jta.atomikos.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 이 클래스는... 
 * @author yoots
 *
 * Created on 2013. 11. 29.
 */
@Repository
public class TestDao2Impl extends SqlSessionTemplate2 implements TestDao2 {

	/* (non-Javadoc)
	 * @see com.jta.jboss.dao.TestDao2#getList()
	 */
	public List<Map> getList(Map map) {
		// TODO Auto-generated method stub
		return selectList("TestDao2.b_test_board", map);
	}

	/* (non-Javadoc)
	 * @see com.jta.jboss.dao.TestDao2#setInsert()
	 */
	public void setInsert(Map map) {
		// TODO Auto-generated method stub
		insert("TestDao2.b_insert_test_board", map);
	}

	public void setInsert2(Map map) {
		// TODO Auto-generated method stub
		insert("TestDao2.b_insert_test_board_2", map);
	}
	
}
