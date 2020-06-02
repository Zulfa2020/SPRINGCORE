package zulfa.bo;

public class EmployeeBO {
	private int empid;
	private String empname;
	private String designation;
	private float basicsalary;
	private float grosssalary;
	private float incometax;
	private float netsalary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}
	public float getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(float grosssalary) {
		this.grosssalary = grosssalary;
	}
	public float getIncometax() {
		return incometax;
	}
	public void setIncometax(float incometax) {
		this.incometax = incometax;
	}
	public float getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(float netsalary) {
		this.netsalary = netsalary;
	}

}
