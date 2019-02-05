package com.example.demo.model;

public class ShippingInfo {
	private double weight;
	private Dimensions dimensions;

	public ShippingInfo() {}
	public ShippingInfo(double weight, Dimensions dimensions) {
		super();
		this.weight = weight;
		this.dimensions = dimensions;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

}
