package com.jbk.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.model.ProductModel;

public class ProductDaoimpl implements ProductDao {

	List<ProductModel> list=new ArrayList<>();
	@Override
	public int addProduct(ProductModel productModel) {
		// TODO Auto-generated method stub
		int status=0;
		for (ProductModel prd : list) {
			
			if(prd.getProductName().equals(productModel.getProductName()))
			{
				status=2;
				break;
			}
		}
			if(status!=2)
			{
				try {
					list.add(productModel);
					status=1;
				} catch (Exception e) {
					e.printStackTrace();
					status=3;
				}
			}
		
		
		
		
		for (ProductModel listProductModel : list) {
			
			System.out.println(listProductModel);
		}
		return status;
	}

}
