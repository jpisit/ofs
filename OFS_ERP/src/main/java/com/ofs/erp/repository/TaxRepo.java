package com.ofs.erp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.Tax;

public interface TaxRepo extends JpaRepository<Tax, Long> {
}


