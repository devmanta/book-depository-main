package com.devmanta.bd.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmanta.bd.dao.DAOTest;
import com.devmanta.bd.vo.TestVO;

@Service
public class BOTestImpl implements BOTest {
	@Autowired
	DAOTest daoTest;
	
	@Override
	public TestVO selectTestByNo(int no) {
		return daoTest.selectTestByNo(no);
	}

}
