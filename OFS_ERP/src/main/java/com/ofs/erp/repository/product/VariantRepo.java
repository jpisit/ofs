package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.Variant;

public interface VariantRepo extends JpaRepository<Variant, Long> {
}
