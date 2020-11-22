package com.ofs.erp.repository.sale;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.sales.SaleOrderItem;

public interface SaleOrderItemRepo extends JpaRepository<SaleOrderItem, Long> {
}


