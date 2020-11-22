package com.ofs.erp.model.product;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_attribute_sel")
public class AttributeSel {

	@Id
	private Long id;
	
	@Column(name = "value")
	private String value;

	@OneToMany(
			mappedBy = "attributeSel",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private Set<AttributeValueSel> attributeValueSelSet;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Variant variant;
	
}