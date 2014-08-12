/*
 * Copyright (c) 2013 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 * 
 * CoreSqlSessionTemplate.java
 */
package com.jta.atomikos.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;


/**
 * 이 클래스는... 
 * @author user
 *
 * Created on 2013. 6. 24.
 */
public class SqlSessionTemplate2 {

	@Resource(name = "sqlSessionTemplate2")
	private SqlSession sqlSession;

	/**
	 * 
	 * @see org.apache.ibatis.session.SqlSession#clearCache()
	 */
	public void clearCache() {
		sqlSession.clearCache();
	}

	/**
	 * 
	 * @see org.apache.ibatis.session.SqlSession#close()
	 */
	public void close() {
		sqlSession.close();
	}

	/**
	 * 
	 * @see org.apache.ibatis.session.SqlSession#commit()
	 */
	public void commit() {
		sqlSession.commit();
	}

	/**
	 * @param arg0
	 * @see org.apache.ibatis.session.SqlSession#commit(boolean)
	 */
	public void commit(boolean arg0) {
		sqlSession.commit(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#delete(java.lang.String, java.lang.Object)
	 */
	public int delete(String arg0, Object arg1) {
		return sqlSession.delete(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#delete(java.lang.String)
	 */
	public int delete(String arg0) {
		return sqlSession.delete(arg0);
	}

	/**
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#flushStatements()
	 */
	public List<BatchResult> flushStatements() {
		return sqlSession.flushStatements();
	}

	/**
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#getConfiguration()
	 */
	public Configuration getConfiguration() {
		return sqlSession.getConfiguration();
	}

	/**
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#getConnection()
	 */
	public Connection getConnection() {
		return sqlSession.getConnection();
	}

	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#getMapper(java.lang.Class)
	 */
	public <T> T getMapper(Class<T> arg0) {
		return sqlSession.getMapper(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#insert(java.lang.String, java.lang.Object)
	 */
	public int insert(String arg0, Object arg1) {
		return sqlSession.insert(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#insert(java.lang.String)
	 */
	public int insert(String arg0) {
		return sqlSession.insert(arg0);
	}

	/**
	 * 
	 * @see org.apache.ibatis.session.SqlSession#rollback()
	 */
	public void rollback() {
		sqlSession.rollback();
	}

	/**
	 * @param arg0
	 * @see org.apache.ibatis.session.SqlSession#rollback(boolean)
	 */
	public void rollback(boolean arg0) {
		sqlSession.rollback(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @see org.apache.ibatis.session.SqlSession#select(java.lang.String, java.lang.Object, org.apache.ibatis.session.ResultHandler)
	 */
	public void select(String arg0, Object arg1, ResultHandler arg2) {
		sqlSession.select(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @see org.apache.ibatis.session.SqlSession#select(java.lang.String, java.lang.Object, org.apache.ibatis.session.RowBounds, org.apache.ibatis.session.ResultHandler)
	 */
	public void select(String arg0, Object arg1, RowBounds arg2,
			ResultHandler arg3) {
		sqlSession.select(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @see org.apache.ibatis.session.SqlSession#select(java.lang.String, org.apache.ibatis.session.ResultHandler)
	 */
	public void select(String arg0, ResultHandler arg1) {
		sqlSession.select(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectList(java.lang.String, java.lang.Object, org.apache.ibatis.session.RowBounds)
	 */
	public <E> List<E> selectList(String arg0, Object arg1, RowBounds arg2) {
		return sqlSession.selectList(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectList(java.lang.String, java.lang.Object)
	 */
	public <E> List<E> selectList(String arg0, Object arg1) {
		return sqlSession.selectList(arg0, arg1);
	}
	
	
	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectList(java.lang.String)
	 */
	public <E> List<E> selectList(String arg0) {
		return sqlSession.selectList(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectMap(java.lang.String, java.lang.Object, java.lang.String, org.apache.ibatis.session.RowBounds)
	 */
	public <K, V> Map<K, V> selectMap(String arg0, Object arg1, String arg2,
			RowBounds arg3) {
		return sqlSession.selectMap(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectMap(java.lang.String, java.lang.Object, java.lang.String)
	 */
	public <K, V> Map<K, V> selectMap(String arg0, Object arg1, String arg2) {
		return sqlSession.selectMap(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectMap(java.lang.String, java.lang.String)
	 */
	public <K, V> Map<K, V> selectMap(String arg0, String arg1) {
		return sqlSession.selectMap(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectOne(java.lang.String, java.lang.Object)
	 */
	public <T> T selectOne(String arg0, Object arg1) {
		return sqlSession.selectOne(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#selectOne(java.lang.String)
	 */
	public <T> T selectOne(String arg0) {
		return sqlSession.selectOne(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#update(java.lang.String, java.lang.Object)
	 */
	public int update(String arg0, Object arg1) {
		return sqlSession.update(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @return
	 * @see org.apache.ibatis.session.SqlSession#update(java.lang.String)
	 */
	public int update(String arg0) {
		return sqlSession.update(arg0);
	}
}
