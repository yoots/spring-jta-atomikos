/*
 * Copyright (c) 2013 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 * 
 * TestService1.java
 */
package com.jta.atomikos.service;

import java.util.List;
import java.util.Map;

/**
 * 이 클래스는... 
 * @author yoots
 *
 * Created on 2013. 11. 29.
 */
public interface TestService2 {

	List<Map> getList(Map map);
	
	void insertBoard(Map map);
}
