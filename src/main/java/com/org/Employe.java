package com.org;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employe {
 
	

	private int EmpId;
	private String name;
	private double salary;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EmpId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (EmpId != other.EmpId)
			return false;
		return true;
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
