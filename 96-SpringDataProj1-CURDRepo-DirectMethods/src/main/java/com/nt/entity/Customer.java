package com.nt.entity;

import java.io.Serializable;


//@Entity
//@Data
public class Customer implements Serializable {
	//@Id
	//@Type(type="int")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cno;
	
	//@Column(length=15)
	//@Type(type="string")
	private String cname;
	
	//@Column(length=15)
	//@Type(type="string")
	private String cadd;
	
	//@Type(type="double")
	private  double billAmt;

	public Customer() {
		System.out.println("Customer:: 0-param constructor");
	}
	
	
	
	public Integer getCno() {
		return cno;
	}
	
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCadd() {
		return cadd;
	}
	
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	
	public double getBillAmt() {
		return billAmt;
	}
	
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", cadd=" + cadd + ", billAmt=" + billAmt + "]";
	}
	
	
	
	
	
	

}
