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
@Table(name = "unit_measure")
public class UnitMeasure {

	@Id
	private Long id;

	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "active_flg")
	private boolean active;
	
	@OneToOne(mappedBy = "uom")
	private Product productUom;
	
	@OneToOne(mappedBy = "puom")
	private Product productPuom;
	
	@OneToOne(mappedBy = "uom")
	private PurchaseRequestItem prOrderItem;
	
}