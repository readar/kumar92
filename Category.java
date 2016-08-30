package com.base.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Category {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tgid;
	
	private String tgname;
	private String tgdescription;
	public int getTgid() {
		return tgid;
	}
	public void setTgid(int tgid) {
		this.tgid = tgid;
	}
	public String getTgname() {
		return tgname;
	}
	public void setTgname(String tgname) {
		this.tgname = tgname;
	}
	public String getTgdescription() {
		return tgdescription;
	}
	public void setTgdescription(String tgdescription) {
		this.tgdescription = tgdescription;
	}
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Product> product;
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	

}
