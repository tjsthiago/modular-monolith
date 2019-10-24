package com.modular.monolith.product;

class ProductOrder {

	private String description;
	
	public ProductOrder(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductOrder [description=" + description + "]";
	}
	
}
