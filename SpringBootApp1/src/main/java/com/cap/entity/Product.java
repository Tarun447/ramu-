package com.cap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="prodname")
	private String prodName;
	
	@Column(name="prodcost")
	private String prodCost;
	
	@Column(name="prodcolor")
	private String prodColor;
	
	public Product(String prodName, String prodCost, String prodColor) {
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}
	
	

}
