package com.ofs.erp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long> {
}


