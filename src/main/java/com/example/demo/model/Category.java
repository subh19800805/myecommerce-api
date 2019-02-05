package com.example.demo.model;

import java.util.Date;

public class Category {
	private String _id;
	private String name;
	private String child_categories;
	private String parent_categories;
	private String image;
	private Date creation_date;
	private Date last_modified_date;
	private String catalog_id;
	private Boolean is_root;
	private Boolean is_active;
	private String meta_title;
	private String meta_keywords;
	private String meta_description;
	private String slug;
	
	public Category() {
		
	}
	public Category(String _id, String name, String child_categories, String parent_categories, String image,
			Date creation_date, Date last_modified_date, String catalog_id, Boolean is_root, Boolean is_active,
			String meta_title, String meta_keywords, String meta_description, String slug) {
		super();
		this._id = _id;
		this.name = name;
		this.child_categories = child_categories;
		this.parent_categories = parent_categories;
		this.image = image;
		this.creation_date = creation_date;
		this.last_modified_date = last_modified_date;
		this.catalog_id = catalog_id;
		this.is_root = is_root;
		this.is_active = is_active;
		this.meta_title = meta_title;
		this.meta_keywords = meta_keywords;
		this.meta_description = meta_description;
		this.slug = slug;
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
	public String getChild_categories() {
		return child_categories;
	}
	public void setChild_categories(String child_categories) {
		this.child_categories = child_categories;
	}
	public String getParent_categories() {
		return parent_categories;
	}
	public void setParent_categories(String parent_categories) {
		this.parent_categories = parent_categories;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public String getCatalog_id() {
		return catalog_id;
	}
	public void setCatalog_id(String catalog_id) {
		this.catalog_id = catalog_id;
	}
	public Boolean getIs_root() {
		return is_root;
	}
	public void setIs_root(Boolean is_root) {
		this.is_root = is_root;
	}
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public String getMeta_title() {
		return meta_title;
	}
	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}
	public String getMeta_keywords() {
		return meta_keywords;
	}
	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}
	public String getMeta_description() {
		return meta_description;
	}
	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	

}
