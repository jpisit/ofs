package com.ofs.erp.model.sales;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ofs.erp.model.Customer;
import com.ofs.erp.model.product.Product;

import lombok.Data;

@Data
@Entity
@Table(name = "sale_order")
public class SaleOrder implements Serializable{

	private static final long serialVersionUID = -6676260730482383491L;

	@Id
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_id", referencedColumnName = "id")
	private Customer customer;
	
	
	@OneToMany(
			mappedBy = "saleOrder",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<SaleOrderItem> saleOrderItemList;
	
	@Column(name = "expired_date")
    private Date expiredDate;
	
	@Column(name = "invoice_address")
	private String invoiceAddress;  
	
	@Column(name = "delivery_address")
	private String deliveryAddress;  

	@Column(name = "note")
	private String note;  
	
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
