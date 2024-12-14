package com.devsuperior.uri2621.dto;

import com.devsuperior.uri2621.projections.ProductMinProjection;

public class ProductMinDTO {

	private String name;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(String name) {
		this.name = name;
	}
	
	public ProductMinDTO(ProductMinProjection projection) {
		name = projection.getName();
	}

	@Override
	public String toString() {
		return "ProuctMinDTO [name=" + name + "]";
	}
	
}
