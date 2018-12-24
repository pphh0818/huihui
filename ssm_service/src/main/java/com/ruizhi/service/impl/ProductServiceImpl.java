package com.ruizhi.service.impl;

import com.ruizhi.dao.IProductDao;
import com.ruizhi.domain.Product;
import com.ruizhi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll() {
        return iProductDao.findAll();
    }
}
