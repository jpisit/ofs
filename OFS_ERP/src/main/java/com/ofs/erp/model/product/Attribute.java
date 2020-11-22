package com.ofs.erp.model.product;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_attribute")
public class Attribute {

	@Id
	private Long id;

	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "displayType")
	private String displayType; 
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "seq")
	private int seq;
	
	@OneToMany(
			mappedBy = "attribute",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private Set<AttributeValue> attributeValueSet;
	
}