package com.modular.monolith.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ProductServiceImpl implements ProductService{

	@Autowired
	private ProtectedComponent protectedComponent;
	
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public void doSomething() {
		protectedComponent.doSomething();
		
		Product product = new Product("modularity product");
		product.setProductOrder(new ProductOrder("modularity product order"));
		
		System.out.println(product.toString());
		
		//Order order = new Order("");
		
		System.out.println("call ProductServiceImpl.doSomething()");
	}

	@Override
	public ProductDTO getProduct() {
		Product product = new Product("modularity product");
		product.setProductOrder(new ProductOrder("modularity product order"));
		return productMapper.toDTO(product);
	}

}
