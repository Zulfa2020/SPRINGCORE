package zulfa.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
private int srNo;
	private int empno;
private String empName;
private String job;
private int sal;
private String deptNo;
public int getSrNo() {
	return srNo;
}
public void setSrNo(int srNo) {
	this.srNo = srNo;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getDeptNo() {
	return deptNo;
}
public void setDeptNo(String deptNo) {
	this.deptNo = deptNo;
}
@Override
public String toString() {
	return "EmployeeDTO [srNo=" + srNo + ", empno=" + empno + ", empName=" + empName + ", job=" + job + ", sal=" + sal
			+ ", deptNo=" + deptNo + "]";
}


	
	
}
