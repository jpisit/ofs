package com.ofs.erp.repository.sale;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.sales.SaleOrder;

public interface SaleOrderRepo extends JpaRepository<SaleOrder, Long> {
}


