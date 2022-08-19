package com.telusko.demo;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String add;
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Address {id=" + id + ", add=" + add + "}";
	}
	
}
