package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
