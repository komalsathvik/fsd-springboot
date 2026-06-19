package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	private int id;
	private String name;
	private String dept;
	private double salary;
	private Date joining_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", joining_date="
				+ joining_date + "]";
	}
	public Employee() {}
	public Employee(int id, String name, String dept, double salary, Date joining_date) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.joining_date = joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	
}
