package com.jbk.service.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.jbk.dao.ProductDao;
import com.jbk.dao.impl.ProductDaoimpl;
import com.jbk.model.ProductModel;
import com.jbk.service.ProductService;

public class ProductServiceImpl implements ProductService {

	ProductDao  dao=new ProductDaoimpl();
	@Override
	public int addProduct(ProductModel productModel) {
		
		String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		productModel.setProductId(Long.parseLong(productId));
		
		Date createdDate=new Date(System.currentTimeMillis());
		productModel.setCreatedDate(createdDate);
		return dao.addProduct(productModel);
		 
	}

}
