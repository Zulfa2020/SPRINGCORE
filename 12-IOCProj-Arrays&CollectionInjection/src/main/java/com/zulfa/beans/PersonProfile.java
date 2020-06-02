package com.zulfa.beans;
//Map Collection
import java.util.Date;
import java.util.Map;

public class PersonProfile {
private Map<String,Long> phones;
private Map<String,Date> impDates;
private Map<Long,String> bankAccounts;

public PersonProfile() {
	System.out.println("...............Map Collection...................");
}

public void setPhones(Map<String, Long> phones) {
	this.phones = phones;
}
public void setImpDates(Map<String, Date> impDates) {
	this.impDates = impDates;
}
public void setBankAccounts(Map<Long, String> bankAccounts) {
	this.bankAccounts = bankAccounts;
}
@Override
public String toString() {
	return "Phones= " + phones + "\nImpDates= " + impDates + ",\nBankAccounts= " + bankAccounts + "-->"+phones.getClass();
}




}
