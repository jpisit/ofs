package com.ofs.erp.repository.purchase;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.purchase.PurchaseOrder;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrder, Long> {
}


