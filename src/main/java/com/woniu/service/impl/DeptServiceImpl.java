package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService{
	@Autowired
	IDeptDAO deptDAO;
	@Override
	public void save(Dept dept) {
		deptDAO.save(dept);
		
	}

	@Override
	public List<Dept> findAll() {
		
		return deptDAO.findAll();
	}

}
