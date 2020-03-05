package com.aciworldwide.BEC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	private Long id;
	private String title;
	private String author;
	private float price;
	private long noInStock;
	private long stopOrder;
	private long reorderingThreshold;
	
	
	public long getReorderingThreshold() {
		return reorderingThreshold;
	}

	public void setReorderingThreshold(long reorderingThreshold) {
		this.reorderingThreshold = reorderingThreshold;
	}

	public Book() {
		super();
	}

	public Book(Long id, String title, String author, float price, long noInStock, long stopOrder,long reorderingThreshold) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.noInStock = noInStock;
		this.stopOrder = stopOrder;
		this.reorderingThreshold = reorderingThreshold;
	}
	
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public long getNoInStock() {
		return noInStock;
	}
	public void setNoInStock(long noInStock) {
		this.noInStock = noInStock;
	}
	public long getStopOrder() {
		return stopOrder;
	}
	public void setStopOrder(long stopOrder) {
		this.stopOrder = stopOrder;
	}

}
