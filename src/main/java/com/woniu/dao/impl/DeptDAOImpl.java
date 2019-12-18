package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Dept dept) {
		sessionFactory.getCurrentSession().save(dept);
		
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> l = sessionFactory.getCurrentSession().createCriteria(Dept.class).list();
		return l;
	}

}
