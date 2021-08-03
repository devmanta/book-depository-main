package com.devmanta.bd;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DAOTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void insert() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("no", 11111);
		map.put("content", "test");
		int rst = sqlSession.insert("com.devmanta.bd.mapper.TestMapper.insertTest", map);
		
		if(rst > 0) {
			 logger.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		} else {
			 logger.info("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		}
	}
}
