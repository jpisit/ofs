package com.ofs.erp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.Sale;

public interface SaleRepo extends JpaRepository<Sale, Long> {
}


