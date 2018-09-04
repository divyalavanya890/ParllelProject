package com.cg.capstore1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.OrderBean;

@Repository
public interface IOrderBeanRepo extends JpaRepository<OrderBean, String> {
	@Query("select p from OrderBean p where p.orderStatus=(:orderStatus)")
	public List<OrderBean> searchOrderByStatus(@Param(value = "orderStatus") String orderStatus);
}
