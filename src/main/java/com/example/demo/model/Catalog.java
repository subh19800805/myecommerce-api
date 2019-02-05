package com.example.demo.model;


public class Catalog {
	private String _id;
	private String name;
	public Catalog() {
	}
	public Catalog(String _id, String name) {
		super();
		this._id = _id;
		this.name = name;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
