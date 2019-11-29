package com.wqf.dao.thread;

import com.wqf.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <pre>
 * Modify Information:
 * Author             Date          Description
 * ============   =============  ===================
 * wangqingfeng      2019/10/14        Create This File
 * </pre>
 */
public class DaoThread implements Runnable {
	private AnnotationConfigApplicationContext annotationConfigApplicationContext;
	private String testStr;

	public DaoThread(AnnotationConfigApplicationContext annotationConfigApplicationContext, String testStr) {
		this.annotationConfigApplicationContext = annotationConfigApplicationContext;
		this.testStr = testStr;
	}

	@Override
	public void run() {
		IndexDao indexDao = (IndexDao) annotationConfigApplicationContext.getBean("indexDao");
		indexDao.setTestStr(testStr);
		System.out.println(Thread.currentThread().getName() + "--第一次打印值:" + indexDao.getTestStr());
		try {
			Thread.sleep(10 * 1000);
			System.out.println(Thread.currentThread().getName() + "--第二次打印值:" + indexDao.getTestStr());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
