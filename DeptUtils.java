package com.deloitte.dept.dao.utils;

public class DeptUtils {
	public static String insertqry="insert into dept  values(?,?,?)";
	public static final String GETDEPTS="select *from dept";
	public static final String UPDATEROW="update dept set dname=?,loc=? where deptno=?";
}
