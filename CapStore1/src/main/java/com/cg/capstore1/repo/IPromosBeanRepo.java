package com.cg.capstore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.capstore1.beans.PromosBean;
@Repository
public interface IPromosBeanRepo extends JpaRepository<PromosBean, String> {
	@Query("select p from PromosBean p where p.promoCode=(:promoCode)")
	public PromosBean searchPromosByCode(@Param(value = "promoCode") String promoCode);
}
