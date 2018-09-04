package com.cg.capstore1.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.AdminBean;
import com.cg.capstore1.beans.ProductBean;
@Repository
public interface IProductBeanRepo extends JpaRepository<ProductBean, String> {
@Query("select p from ProductBean p where productName=(:name)")
public List<ProductBean> searchProductByName(@Param(value = "name") String name);

@Query("select p from ProductBean p where category=(:category)")
public List<ProductBean> searchProductBycategory(@Param(value = "category") String category);

@Query("select p from ProductBean p where price=(:price)")
public List<ProductBean> searchProductByprice(@Param(value = "price") Double price);

}
