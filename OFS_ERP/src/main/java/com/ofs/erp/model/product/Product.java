package com.ofs.erp.model.product;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ofs.erp.model.Tax;
import com.ofs.erp.model.UnitMeasure;
import com.ofs.erp.model.Vendor;
import com.ofs.erp.model.purchase.PurchaseOrderItem;
import com.ofs.erp.model.purchase.PurchaseRequestItem;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable{

	private static final long serialVersionUID = -6676260730482383491L;

	@Id
	private int id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "can_sold_flg")
	private boolean canSold;
	
	@Column(name = "can_purchase_flg")
	private boolean canPurchase;
	
	@Column(name = "product_type")
	private String productType;
	
	@ManyToMany
	@JoinTable(
	  name = "product_category", 
	  joinColumns = @JoinColumn(name = "product_id"), 
	  inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categoriesSet;
	
	@Column(name = "qr_code")
	private String qrCode;
	
	@Column(name = "sale_price")
	private double salesPrice;
	
	@Column(name = "cost")
	private double cost;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owned_id", referencedColumnName = "id")
	private Vendor ownedVendor;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uom_id", referencedColumnName = "id")
	private UnitMeasure uom;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "puom_id", referencedColumnName = "id")
	private UnitMeasure puom;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_id", referencedColumnName = "id")
	private Tax tax;
	
	@OneToOne(mappedBy = "product")
	private PurchaseRequestItem purchaseRequestItem;
	
	@OneToOne(mappedBy = "product")
	private PurchaseOrderItem purchaseOrderItem;
	
	@Column(name = "memo")
	private String memo;
	
	@OneToMany(
			mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private Set<Variant> variants;
	
	@OneToMany(
			mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private Set<Image> images;
	
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
