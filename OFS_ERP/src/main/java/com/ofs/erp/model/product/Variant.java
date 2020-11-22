package com.ofs.erp.model.product;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_variant")
public class Variant {

	@Id
	private Long id;
	
	@OneToMany(
			mappedBy = "variant",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private Set<AttributeSel> attributeSelList;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Product product;
 
	
}