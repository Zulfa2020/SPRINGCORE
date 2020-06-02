package zulfa.bo;

public class EmployeeBO {
private int empno;
private String empName;
private String job;
private int sal;
private int deptNo;
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
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
@Override
public String toString() {
	return "EmployeeBO [empno=" + empno + ", empName=" + empName + ", job=" + job + ", sal=" + sal + ", deptNo="
			+ deptNo + "]";
}


	
	
}
