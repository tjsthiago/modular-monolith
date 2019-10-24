package com.modular.monolith.product;

class Product {

	private String name;
	
	private ProductOrder productOrder;

	public Product(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductOrder getProductOrder() {
		return productOrder;
	}

	public void setProductOrder(ProductOrder productOrder) {
		this.productOrder = productOrder;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", productOrder=" + productOrder + "]";
	}
	
}
