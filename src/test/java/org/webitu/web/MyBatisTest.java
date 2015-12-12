package org.webitu.web;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBatisTest extends DataSourceTest {

	@Autowired
	private SqlSessionFactory sqlFactory;

	@Test
	public void testSession() throws Exception {

		System.out.println(sqlFactory);
		try (SqlSession session = sqlFactory.openSession()) {
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
