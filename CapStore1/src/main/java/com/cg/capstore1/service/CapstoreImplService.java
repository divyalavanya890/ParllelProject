package com.cg.capstore1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore1.beans.CustomerBean;
import com.cg.capstore1.beans.DiscountBean;
import com.cg.capstore1.beans.MerchantBean;
import com.cg.capstore1.beans.OrderBean;
import com.cg.capstore1.beans.ProductBean;
import com.cg.capstore1.beans.PromosBean;
import com.cg.capstore1.repo.ICustomerBeanRepo;
import com.cg.capstore1.repo.IDiscountBeanRepo;
import com.cg.capstore1.repo.IMerchantBeanRepo;
import com.cg.capstore1.repo.IOrderBeanRepo;
import com.cg.capstore1.repo.IProductBeanRepo;
import com.cg.capstore1.repo.IPromosBeanRepo;
@Service
public class CapstoreImplService implements ICapstoreService {

	@Autowired
	IProductBeanRepo productRepo;
	@Autowired
	ICustomerBeanRepo customerRepo;
	@Autowired
	IMerchantBeanRepo merchantRepo;
	@Autowired
	IOrderBeanRepo orderRepo;
	@Autowired
	IPromosBeanRepo promosRepo;
	@Autowired
	IDiscountBeanRepo discountRepo;
	@Override
	public List<ProductBean> searchProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepo.searchProductByName(name);
	}

	@Override
	public List<ProductBean> searchProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepo.searchProductBycategory(category);
	}

	@Override
	public List<ProductBean> searchProductByprice(Double price) {
		// TODO Auto-generated method stub
		return productRepo.searchProductByprice(price);
	}
	//Admin search by customer name
	@Override
	public CustomerBean searchCustomerByname(String name) {
		
		return customerRepo.searchCustomerByName(name);
	}
//Merchant search by merchant name
	@Override
	public MerchantBean searchMerchantByname(String name) {
		// TODO Auto-generated method stub
		return merchantRepo.searchMerchantByName(name);
	}

	
	

	@Override
	public List<OrderBean> searchOrderByStatus(String Status) {
		// TODO Auto-generated method stub
		return orderRepo.searchOrderByStatus(Status);
	}

	@Override
	public OrderBean searchOrderById(String id) {
		// TODO Auto-generated method stub
		return orderRepo.getOne(id);
		
	}

	@Override
	public PromosBean searchPromosByCode(String Code) {
		// TODO Auto-generated method stub
		return promosRepo.searchPromosByCode(Code);
	}

	@Override
	public DiscountBean searchDiscountById(String Id) {
		// TODO Auto-generated method stub
		return discountRepo.searchDiscountById(Id);
	}

	/*@Override
	public List<ProductBean> searchProductByCategory(String category) {
		// TODO Auto-generated method stub
		return merchantRepo.searchProductBycategory(category);
	}*/
}


	
	

