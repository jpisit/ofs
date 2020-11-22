package com.ofs.erp.repository.purchase;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.purchase.PurchaseRequestItem;

public interface PurchaseRequestItemRepo extends JpaRepository<PurchaseRequestItem, Long> {
}


