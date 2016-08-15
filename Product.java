package com.base.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int ptid;
	private String ptname;
	private String ptdescription;
	private double ptprice;
	private String ptquantity;
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	@Transient
	private MultipartFile img;
	
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public String getPtname() {
		return ptname;
	}
	public void setPtname(String ptname) {
		this.ptname = ptname;
	}
	public String getPtdescription() {
		return ptdescription;
	}
	public void setPtdescription(String ptdescription) {
		this.ptdescription = ptdescription;
	}
	public double getPtprice() {
		return ptprice;
	}
	public void setPtprice(double ptprice) {
		this.ptprice = ptprice;
	}
	public String getPtquantity() {
		return ptquantity;
	}
	public void setPtquantity(String ptquantity) {
		this.ptquantity = ptquantity;
	}

	
	
}
