package com.ofs.erp.model.inventory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.purchase.PurchaseRequest;

import lombok.Data;

@Data
@Entity
@Table(name = "warehouse")
public class Warehouse {

	@Id
	private Long id;

	@Column(name = "short_name", length = 10)
	private String shortName;
	
	@Column(name = "address")
	private String address;
	
	
	@OneToOne(mappedBy = "warehouse")
	private PurchaseRequest pr;
	
	
	 
	 
	 

}
