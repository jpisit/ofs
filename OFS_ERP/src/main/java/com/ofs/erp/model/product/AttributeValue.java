package com.ofs.erp.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_attribute_val")
public class AttributeValue {

	@Id
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Attribute attribute;
	
	@Column(name = "value")
	private String value;
	 
	
}