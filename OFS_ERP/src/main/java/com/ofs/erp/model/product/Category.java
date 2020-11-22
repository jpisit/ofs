package com.ofs.erp.model.product;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category {

	@Id
	private int id;
	
	@Column(name = "name", length = 100)
	private String name;
	
	@ManyToMany(mappedBy = "categoriesSet")
	private Set<Product> productSet;

	
}
