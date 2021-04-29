package com.detail;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="user")
@SessionScoped
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empId;
	private String empName;
	private String prjtName;
	private String mobSelf;
	private String familyMembName;
	private String familyMembRel;
	private String familyMembMob;

	
	public User() {}


	public User(String empId, String empName, String prjtName, String mobSelf, String familyMembName,
			String familyMembRel, String familyMembMob) {
		this.empId = empId;
		this.empName = empName;
		this.prjtName = prjtName;
		this.mobSelf = mobSelf;
		this.familyMembName = familyMembName;
		this.familyMembRel = familyMembRel;
		this.familyMembMob = familyMembMob;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getPrjtName() {
		return prjtName;
	}


	public void setPrjtName(String prjtName) {
		this.prjtName = prjtName;
	}


	public String getMobSelf() {
		return mobSelf;
	}


	public void setMobSelf(String mobSelf) {
		this.mobSelf = mobSelf;
	}


	public String getFamilyMembName() {
		return familyMembName;
	}


	public void setFamilyMembName(String familyMembName) {
		this.familyMembName = familyMembName;
	}


	public String getFamilyMembRel() {
		return familyMembRel;
	}


	public void setFamilyMembRel(String familyMembRel) {
		this.familyMembRel = familyMembRel;
	}


	public String getFamilyMembMob() {
		return familyMembMob;
	}


	public void setFamilyMembMob(String familyMembMob) {
		this.familyMembMob = familyMembMob;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String display1()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(prjtName);
		System.out.println(mobSelf);
		System.out.println(familyMembName);
		System.out.println(familyMembMob);
		System.out.println(familyMembRel);
		
		return "response";
	}
	
	
	
}
