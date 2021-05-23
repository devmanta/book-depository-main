package com.devmanta.bd;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DAOTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void insert() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("no", 11111);
		map.put("content", "잘들어가나");
		sqlSession.insert("com.devmanta.bd.mapper.TestMapper.insertTest", map);
	}
}
