package com.modular.monolith.product;

import lombok.Data;

@Data
class ProductDTO {
	private String name;
	private ProductOrderDTO productOrder;
}
