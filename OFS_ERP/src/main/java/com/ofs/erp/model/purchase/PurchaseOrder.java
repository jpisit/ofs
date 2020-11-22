package com.ofs.erp.model.purchase;

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

import org.hibernate.annotations.UpdateTimestamp;

import com.ofs.erp.model.Sale;
import com.ofs.erp.model.Vendor;
import com.ofs.erp.model.inventory.Warehouse;

import lombok.Data;

@Data
@Entity
@Table(name = "purchase_order")
public class PurchaseOrder implements Serializable{

	private static final long serialVersionUID = -6676260730482383491L;

	@Id
	private int id;
	
	@Column(name = "po_no")
	private String po_no; 
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_id", referencedColumnName = "id")
	private Vendor vendor;
	
	@Column(name = "reference")
	private String reference; 
	
	@Column(name = "agreement_note")
	private String agreementNote;
	
	@Column(name = "receipt_date")
	private Date receiptDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_id", referencedColumnName = "id")
	private Sale sale;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
	private Warehouse warehouse;
	
	@Column(name = "payment_term")
	private String paymentTerm; 
	
	@OneToMany(
			mappedBy = "puchaseReq",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<PurchaseOrderItem> purchaseItemList;

	@Column(name = "note")
	private String note;  
	
	@Column(name = "status")
	private String status;  
	
	@Column(name = "order_date")
    private Date orderDate;
	
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
