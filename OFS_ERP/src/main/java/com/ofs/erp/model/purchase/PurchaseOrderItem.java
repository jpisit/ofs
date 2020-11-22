package com.ofs.erp.model.purchase;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ofs.erp.model.Tax;
import com.ofs.erp.model.UnitMeasure;
import com.ofs.erp.model.product.Product;

import lombok.Data;

@Data
@Entity
@Table(name = "purchase_order_item")
public class PurchaseOrderItem implements Serializable{

	private static final long serialVersionUID = -6676260730482383491L;

	@Id
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;
	
	@Column(name = "qty")
	private int qty;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uom_id", referencedColumnName = "id")
	private UnitMeasure uom;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_id", referencedColumnName = "id")
	private Tax tax;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private PurchaseOrder puchaseOrder;
	 
 
	

}
