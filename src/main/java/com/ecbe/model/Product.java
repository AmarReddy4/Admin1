package com.ecbe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Product")
@Component
public class Product {
	@Id
	private String id;
	private String name;
	private int price;
	private String Category_id;
	private String Supplier_id;
	private int stock;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory_id() {
		return Category_id;
	}
	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}
	public String getSupplier_id() {
		return Supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		Supplier_id = supplier_id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
}