package com.ofs.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.sales.SaleOrder;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	private Long id;

	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "cust_type", length = 100)
	private String customerType;
	
//	@OneToOne
//	private Vendor company;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "subDistrict")
	private String subDistrict;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "tax_id")
	private String taxId;
	
	@Column(name = "tel_no")
	private String telNo;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "fax_no")
	private String faxNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "website")
	private String website; 
	 
	@OneToOne(mappedBy = "customer")
	private SaleOrder saleOrder;
	 
	 

}
