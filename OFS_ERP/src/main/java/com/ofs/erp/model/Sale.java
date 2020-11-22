package com.ofs.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.purchase.PurchaseRequest;

import lombok.Data;

@Data
@Entity
@Table(name = "sale")
public class Sale {

	@Id
	private Long id;

	@Column(name = "first_name", length = 50)
	private String firstName;
	
	@Column(name = "last_name", length = 100)
	private String lastName;
	
	@Column(name = "phone", length = 30)
	private String phone;
	
	@Column(name = "mobile", length = 30)
	private String mobile;
	
	@Column(name = "address", length = 200)
	private String address;
	 
	@Column(name = "picture")
	private byte[] picture;
	 
	@OneToOne(mappedBy = "sale")
	private PurchaseRequest purchaseSale;
	

}
