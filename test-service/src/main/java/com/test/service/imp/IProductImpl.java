package com.test.service.imp;

import com.test.dao.IProductDao;
import com.test.domain.Product;
import com.test.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IProductImpl implements IProductService {
    @Autowired
    private IProductDao iProductDao;

    @Override
    public List<Product> findAll() {
        return iProductDao.findAll();
    }
}
