package com.BikkadIT.CrudRepositoryMethod1.Entites;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Dlts")
public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_rollno")
	private int rollno;
	@Column(name = "stu_name")
	private String name;
	@Column(name = "stu_addr")
	private String addr;
	@Column(name = "stu_panNo")
	private String panNo;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + ", panNo=" + panNo + "]";
	}
	
}
