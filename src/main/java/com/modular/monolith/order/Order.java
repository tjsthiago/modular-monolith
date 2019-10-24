package com.modular.monolith.order;

class Order {
	
	private String description;
	
	public Order(String description) {
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
		return "Order [description=" + description + "]";
	}
	
}
