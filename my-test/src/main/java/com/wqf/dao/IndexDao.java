package com.wqf.dao;

import org.springframework.stereotype.Repository;

/**
 * <pre>
 * Modify Information:
 * Author             Date          Description
 * ============   =============  ===================
 * wangqingfeng      2019/10/12        Create This File
 * </pre>
 */
@Repository
public class IndexDao {
	private String testStr;

	public void insert() {
		System.out.println("调用INSERT");
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}
