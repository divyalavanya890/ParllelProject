package com.cg.capstore1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.capstore1.beans.MerchantBean;
import com.cg.capstore1.beans.ProductBean;
@Repository
public interface IMerchantBeanRepo extends JpaRepository<MerchantBean, String> {
	@Query("select p from MerchantBean p where merchantName=(:merchantName)")
	public MerchantBean searchMerchantByName(@Param(value = "merchantName") String name);
	
	@Query("select p from ProductBean p where category=(:category)")
	public List<ProductBean> searchProductBycategory(@Param(value = "category") String category);
}
