package com.ofs.erp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}


