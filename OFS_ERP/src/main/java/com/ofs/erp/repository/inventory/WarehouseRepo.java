package com.ofs.erp.repository.inventory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.Customer;
import com.ofs.erp.model.inventory.Warehouse;

public interface WarehouseRepo extends JpaRepository<Warehouse, Long> {
}


