package com.cg.capstore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.DiscountBean;

@Repository
public interface IDiscountBeanRepo extends JpaRepository<DiscountBean, String> {
	@Query("select p from DiscountBean p where p.discountId=(:discountId)")
	public DiscountBean searchDiscountById(@Param(value = "discountId") String discountId);
}
