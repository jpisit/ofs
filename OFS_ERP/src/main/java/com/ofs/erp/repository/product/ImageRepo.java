package com.ofs.erp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofs.erp.model.product.Image;

public interface ImageRepo extends JpaRepository<Image, Long> {
}
