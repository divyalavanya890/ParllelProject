package com.cg.capstore1.service;

import java.util.List;

import com.cg.capstore1.beans.CustomerBean;
import com.cg.capstore1.beans.DiscountBean;
import com.cg.capstore1.beans.MerchantBean;
import com.cg.capstore1.beans.OrderBean;
import com.cg.capstore1.beans.ProductBean;
import com.cg.capstore1.beans.PromosBean;

public interface ICapstoreService {
	List<ProductBean> searchProductByName(String name);
	List<ProductBean> searchProductByCategory(String category);
	List<ProductBean> searchProductByprice(Double price);
	CustomerBean searchCustomerByname(String name);
	MerchantBean searchMerchantByname(String name);
	OrderBean searchOrderById(String id);
	List<OrderBean> searchOrderByStatus(String Status);
	PromosBean searchPromosByCode(String Code);
	DiscountBean searchDiscountById(String Id);
	//List<ProductBean> searchProductByCategory(String category);
	
}
