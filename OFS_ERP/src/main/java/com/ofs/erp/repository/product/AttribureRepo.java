package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.Attribute;

public interface AttribureRepo extends JpaRepository<Attribute, Long> {
}
