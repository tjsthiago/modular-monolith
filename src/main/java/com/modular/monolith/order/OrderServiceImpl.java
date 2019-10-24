package com.modular.monolith.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modular.monolith.product.ProductService;

@Service
class OrderServiceImpl implements OrderService{

	@Autowired
	private ProductService productService;
	
	//private ProtectedComponent protectedComponent;
	
	@Override
	public String doSomething() {
		productService.doSomething();
		System.out.println("call OrderServiceImpl.doSomething()");
		return "call OrderServiceImpl.doSomething()";
	}

}
