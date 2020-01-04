package com.deloitte.dep.dao;

import java.util.List;

import com.deloitte.dept.beans.Dept;

public interface DeptDao {
	void openConnection();
	void close();
	int addDept(int deptno,String dname,String loc);
	int upDept(String dname,String loc,int deptno);
	List<Dept> getDept();

}
