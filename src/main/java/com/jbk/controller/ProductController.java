package com.jbk.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.ProductModel;
import com.jbk.service.ProductService;
import com.jbk.service.impl.ProductServiceImpl;

@RestController
public class ProductController {
	
	ProductService  service=new ProductServiceImpl();
	@PostMapping("/add-product")
	public String addProduct(@RequestBody @Valid ProductModel productModel)
	{
		int status = service.addProduct(productModel);
		if(status==1)
		{
			return "Added Succesfully !!!";
		}
		else if(status==2)
		{
		return"Product Already Exist !!"+productModel.getProductName();
			
		}
		else {
			return "Somthing Went Wrong";
		}
	}

}
