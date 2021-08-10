package com.devmanta.bd.dao;


import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devmanta.bd.vo.TestVO;

@Repository
public class DAOTestImpl implements DAOTest{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SqlSession sqlSession;

	@Override
	public TestVO selectTestByNo(int no) {
		return sqlSession.selectOne("com.devmanta.bd.dao.DAOTest.selectTestByNo", no);
		
	}
}
