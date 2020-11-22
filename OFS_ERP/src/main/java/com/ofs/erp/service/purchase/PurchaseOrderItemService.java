package com.ofs.erp.service.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.erp.model.product.Product;
import com.ofs.erp.repository.product.ProductRepo;


@Service
public class PurchaseOrderItemService  {
	
	@Autowired
	ProductRepo productRepo; 
 
	public Product getById(Long id) {
		return productRepo.getOne(id);
	}
	
	public List<Product> getAll() {
		return productRepo.findAll();
	}
	
	public Product save(Product product) {
		return productRepo.save(product);
	}
	
	public void delete(Product product) {
		productRepo.delete(product);
	}
	

}
