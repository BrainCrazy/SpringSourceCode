package com.wqf;

import com.wqf.dao.IndexDao;
import com.wqf.dao.thread.DaoThread;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <pre>
 * Modify Information:
 * Author             Date          Description
 * ============   =============  ===================
 * wangqingfeng      2019/10/12        Create This File
 * </pre>
 */
public class AnnotationMain {
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = (IndexDao) annotationConfigApplicationContext.getBean("indexDao");
		indexDao.insert();
	}
}
