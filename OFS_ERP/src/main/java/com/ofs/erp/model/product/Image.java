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
@Table(name = "product_image")
public class Image {

	@Id
	private Long id;

	@Column(name = "url", length = 100)
	private String url;
	
	@Column(name = "status", length = 2)
	private String status;
	
	@Column(name = "seq")
	private int seq;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Product product;
	
}