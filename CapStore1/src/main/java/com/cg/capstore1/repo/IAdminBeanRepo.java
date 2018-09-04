package com.cg.capstore1.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.AdminBean;
import com.cg.capstore1.beans.CustomerBean;

@Repository
public interface IAdminBeanRepo extends JpaRepository<AdminBean, String> {
	/*@Query("select p from CustomerBean p where emailId=(:email)")
	public CustomerBean searchCustomerByemailId(@Param(value = "email") String email);*/
}
