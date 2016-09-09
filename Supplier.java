package com.base.model;



import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Supplier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int spid;
	
	@Column(name="SupplierName")
	private String spname;
	

	@Column(name="Address")
	private String spaddress;
	
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getSpaddress() {
		return spaddress;
	}
	public void setSpaddress(String spaddress) {
		this.spaddress = spaddress;
	}
	
/*    @OneToMany(cascade=CascadeType.ALL,mappedBy="supplier",orphanRemoval=true)
	public List<Product> product;

	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}*/
    
    
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="supplier")
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}