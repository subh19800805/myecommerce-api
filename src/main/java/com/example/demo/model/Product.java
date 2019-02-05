package com.example.demo.model;

import java.util.Date;

public class Product {

	private String _id;
	private String product_display_name;
	private String category_ids;//Array todo
	private Price price;
	private Boolean is_active;
	private Boolean on_sale;
	private String upc;
	private String mpn;
	private String manufacturer;
	private String product_short_description;
	private String product_long_description;
	private String thumbnail_image;
	private String images;//Array todo
	private ShippingInfo shippingInfo;
	private Date creation_date;
	private Date last_modified_date;
	private double avg_product_review_ratings;
	private String specifications;
	private String additional_product_info; //Array todo
	
	public Product() {}	
	
	public Product(String _id, String product_display_name, String category_ids, Price price, Boolean is_active,
			Boolean on_sale, String upc, String mpn, String manufacturer, String product_short_description,
			String product_long_description, String thumbnail_image, String images, ShippingInfo shippingInfo,
			Date creation_date, Date last_modified_date, double avg_product_review_ratings, String specifications,
			String additional_product_info) {
		super();
		this._id = _id;
		this.product_display_name = product_display_name;
		this.category_ids = category_ids;
		this.price = price;
		this.is_active = is_active;
		this.on_sale = on_sale;
		this.upc = upc;
		this.mpn = mpn;
		this.manufacturer = manufacturer;
		this.product_short_description = product_short_description;
		this.product_long_description = product_long_description;
		this.thumbnail_image = thumbnail_image;
		this.images = images;
		this.shippingInfo = shippingInfo;
		this.creation_date = creation_date;
		this.last_modified_date = last_modified_date;
		this.avg_product_review_ratings = avg_product_review_ratings;
		this.specifications = specifications;
		this.additional_product_info = additional_product_info;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getProduct_display_name() {
		return product_display_name;
	}

	public void setProduct_display_name(String product_display_name) {
		this.product_display_name = product_display_name;
	}

	public String getCategory_ids() {
		return category_ids;
	}

	public void setCategory_ids(String category_ids) {
		this.category_ids = category_ids;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	public Boolean getOn_sale() {
		return on_sale;
	}

	public void setOn_sale(Boolean on_sale) {
		this.on_sale = on_sale;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProduct_short_description() {
		return product_short_description;
	}

	public void setProduct_short_description(String product_short_description) {
		this.product_short_description = product_short_description;
	}

	public String getProduct_long_description() {
		return product_long_description;
	}

	public void setProduct_long_description(String product_long_description) {
		this.product_long_description = product_long_description;
	}

	public String getThumbnail_image() {
		return thumbnail_image;
	}

	public void setThumbnail_image(String thumbnail_image) {
		this.thumbnail_image = thumbnail_image;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
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

	public double getAvg_product_review_ratings() {
		return avg_product_review_ratings;
	}

	public void setAvg_product_review_ratings(double avg_product_review_ratings) {
		this.avg_product_review_ratings = avg_product_review_ratings;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getAdditional_product_info() {
		return additional_product_info;
	}

	public void setAdditional_product_info(String additional_product_info) {
		this.additional_product_info = additional_product_info;
	}
}
