package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
