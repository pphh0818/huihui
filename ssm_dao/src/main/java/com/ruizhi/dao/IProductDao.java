package com.ruizhi.dao;

import com.ruizhi.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    @Select("select * from product")
    public List<Product> findAll();
}
