package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.AttributeValue;

public interface AttributeValueRepo extends JpaRepository<AttributeValue, Long> {
}
