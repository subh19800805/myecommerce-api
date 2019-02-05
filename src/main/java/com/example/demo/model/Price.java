package com.example.demo.model;

public class Price {
	private double list_price;
	private double sale_price;
	private double whole_sale_price;
	
	
	public Price() {}
	public Price(double list_price, double sale_price, double whole_sale_price) {
		super();
		this.list_price = list_price;
		this.sale_price = sale_price;
		this.whole_sale_price = whole_sale_price;
	}
	public double getList_price() {
		return list_price;
	}
	public void setList_price(double list_price) {
		this.list_price = list_price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public double getWhole_sale_price() {
		return whole_sale_price;
	}
	public void setWhole_sale_price(double whole_sale_price) {
		this.whole_sale_price = whole_sale_price;
	}

	
	

}
