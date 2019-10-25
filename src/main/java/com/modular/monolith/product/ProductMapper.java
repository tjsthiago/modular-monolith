package com.modular.monolith.product;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
interface ProductMapper {

	ProductDTO toDTO(Product product);
	
	Product toModel(ProductDTO productDTO);
	
}
