package com.ofs.erp.repository.purchase;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.purchase.PurchaseRequest;

public interface PurchaseRequestRepo extends JpaRepository<PurchaseRequest, Long> {
}


