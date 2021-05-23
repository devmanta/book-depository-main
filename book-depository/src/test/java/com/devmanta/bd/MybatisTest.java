package com.devmanta.bd;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MybatisTest {

	@Autowired
	private SqlSessionFactory s;
	
	@org.junit.Test
	public void testFactory() {
		System.out.println(s);
	}
	
	public void testSqlSession() {
		try(SqlSession ss = s.openSession()){
			System.out.println(ss);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
