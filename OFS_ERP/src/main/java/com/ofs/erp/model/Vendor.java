package com.ofs.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.product.Product;
import com.ofs.erp.model.purchase.PurchaseRequest;

import lombok.Data;

@Data
@Entity
@Table(name = "vendor")
public class Vendor {

	@Id
	private Long id;

	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "cust_type", length = 100)
	private String customerType;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "sub_district")
	private String subDistrict;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "tel_no")
	private String telNo;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "fax_no")
	private String faxNo;
	
//	@Column(name = "parent_company")
//	private Vendor parent;
	
	 @OneToOne(mappedBy = "ownedVendor")
	 private Product product;
	 
	 @OneToOne(mappedBy = "vendor")
	 private PurchaseRequest purchaseReq;
	 
	 
	 
	 

}
