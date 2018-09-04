package com.cg.capstore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.CustomerBean;
@Repository
public interface ICustomerBeanRepo extends JpaRepository<CustomerBean, String> {
	@Query("select p from CustomerBean p where p.customerName=(:customerName)")
	public CustomerBean searchCustomerByName(@Param(value = "customerName") String name);
}
