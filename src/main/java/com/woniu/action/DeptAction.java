package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Controller
public class DeptAction extends ActionSupport{
	
	@Autowired
	IDeptService deptService;
	private Dept dept;
	private List<Dept> depts;
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	
	
	public String save() {
		
		deptService.save(dept);
		return "success";
	}
	

}
