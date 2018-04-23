package com.org;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employe {

	
	private int EmpId;
	private String name;
	private double salary;{
		
	}
	public Employe() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Employe (int EmpId, String name, double salary) {
		super();
	this.EmpId=EmpId;
	this.name = name;
	this.salary = salary;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalagy() {
		return salary;
	}
	public void setSalagy(double salagy) {
		this.salary = salagy;
	}

}
