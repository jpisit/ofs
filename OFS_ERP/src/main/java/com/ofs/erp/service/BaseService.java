package com.ofs.erp.service;

import org.springframework.stereotype.Service;

@Service
public interface BaseService<T, ID> {

	T getById(ID id);
}
