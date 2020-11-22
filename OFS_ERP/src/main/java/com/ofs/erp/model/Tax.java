package com.ofs.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.product.Product;
import com.ofs.erp.model.purchase.PurchaseRequestItem;

import lombok.Data;

@Data
@Entity
@Table(name = "tax")
public class Tax {

	@Id
	private Long id;

	@Column(name = "name", length = 100)
	private String name;
	
	@OneToOne(mappedBy = "tax")
	private Product product;
	
	@OneToOne(mappedBy = "tax")
	private PurchaseRequestItem prOrderItem;
}