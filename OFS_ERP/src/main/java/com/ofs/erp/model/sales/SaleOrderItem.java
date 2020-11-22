package com.ofs.erp.model.sales;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ofs.erp.model.product.Product;

import lombok.Data;

@Data
@Entity
@Table(name = "sale_order_item")
public class SaleOrderItem implements Serializable{

	private static final long serialVersionUID = -6676260730482383491L;

	@Id
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private SaleOrder saleOrder;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "disc_pct")
	private double discountPct;
	
	@Column(name = "tax")
	private double tax;
	
	@CreationTimestamp
	@Column(name = "created_date")
    private Date createdDate;

	@Column(name = "created_by")
	private String createdBy; 
	
    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date updatedDate;
    
    @Column(name = "updated_by")
	private String updatedBy; 

	

}
