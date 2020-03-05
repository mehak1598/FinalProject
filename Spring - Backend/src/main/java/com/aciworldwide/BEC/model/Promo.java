package com.aciworldwide.BEC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promos")
public class Promo {

	private Long id;
	private String promocode;
	private int discount;
	
	
	public Promo() {
		super();
	}
	public Promo(Long id, String promocode, int discount) {
		super();
		this.id = id;
		this.promocode = promocode;
		this.discount = discount;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
