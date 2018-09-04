package com.cg.capstore1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.capstore1.beans.CustomerBean;
import com.cg.capstore1.beans.DiscountBean;
import com.cg.capstore1.beans.MerchantBean;
import com.cg.capstore1.beans.OrderBean;
import com.cg.capstore1.beans.ProductBean;
import com.cg.capstore1.beans.PromosBean;
import com.cg.capstore1.service.ICapstoreService;

@RestController
public class CapStoreController {
	@Autowired
	ICapstoreService service;
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public List<ProductBean> searchByName(String name) {
		return service.searchProductByName(name); 
	}
	
	@RequestMapping(value="/searchcategory",method=RequestMethod.GET)
	public List<ProductBean> searchByCategory(String category) {
		return service.searchProductByCategory(category);
		
	}
	@RequestMapping(value="/searchprice",method=RequestMethod.GET)
	public List<ProductBean> searchByprice(Double price) {
		return service.searchProductByprice(price);
}
	@RequestMapping(value="/searchName",method=RequestMethod.GET)
	public CustomerBean searchByName1(String name) {
		return service.searchCustomerByname(name);
}
	@RequestMapping(value="/searchN1",method=RequestMethod.GET)
	public MerchantBean searchByName2(String name) {
		return service.searchMerchantByname(name);
	
}
	@RequestMapping(value="/searchorder",method=RequestMethod.GET)
	public OrderBean searchById(String id) {
		return service.searchOrderById(id);	
		
}
	@RequestMapping(value="/searchStatus",method=RequestMethod.GET)
	public List<OrderBean> searchOrderByStatus(String Status) {
		return service.searchOrderByStatus(Status);	
}
	@RequestMapping(value="/searchCode",method=RequestMethod.GET)
	public PromosBean searchPromosByCode(String Code) {
		return service.searchPromosByCode(Code);	
}
	@RequestMapping(value="/searchId",method=RequestMethod.GET)
	public DiscountBean searchDiscountById(String Id) {
		return service.searchDiscountById(Id);	
}
	@RequestMapping(value="/searchCategory",method=RequestMethod.GET)
	public List<ProductBean> searchProductsByCategory(String category) {
		return service.searchProductByCategory(category);
		}
}
	
	
	