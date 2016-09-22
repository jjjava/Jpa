/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2.manytoone;

/**
 *
 * @author hudson
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Department implements Serializable {

	@Id
	private int iddepartment;
	private String name;
 
	public int getIddepartment() {
		return iddepartment;
	}
 
	public void setIddepartment(int iddepartment) {
		this.iddepartment = iddepartment;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "Department [iddepartment=" + iddepartment + ", name=" + name
				+ "]";
	}
 
}

