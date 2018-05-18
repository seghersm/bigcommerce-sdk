package com.bigcommerce.catalog.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductImage {

	private Integer id;

	@XmlElement(name = "image_url")
	private String imageUrl;

	@XmlElement(name = "is_thumbnail")
	private Boolean isThumbnail;

	@XmlElement(name = "product_id")
	private Integer productId;

	@XmlElement(name = "sort_order")
	private Integer sortOrder;

	@XmlElement(name = "image_file")
	private String imageFile;

	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(final String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getIsThumbnail() {
		return isThumbnail;
	}

	public void setIsThumbnail(final Boolean isThumbnail) {
		this.isThumbnail = isThumbnail;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(final Integer productId) {
		this.productId = productId;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
}
