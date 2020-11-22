package com.ofs.erp.repository.purchase;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.purchase.PurchaseOrderItem;

public interface PurchaseOrderItemRepo extends JpaRepository<PurchaseOrderItem, Long> {
}


