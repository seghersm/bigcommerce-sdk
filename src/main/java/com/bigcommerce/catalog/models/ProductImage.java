package com.bigcommerce.catalog.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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

  @XmlElement(name = "url_zoom")
  private String urlZoom;

  @XmlElement(name = "url_standard")
  private String urlStandard;

  @XmlElement(name = "url_thumbnail")
  private String urlThumbnail;

  @XmlElement(name = "url_tiny")
  private String urlTiny;

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

  public String getUrlZoom() {
    return urlZoom;
  }

  public void setUrlZoom(String urlZoom) {
    this.urlZoom = urlZoom;
  }

  public String getUrlStandard() {
    return urlStandard;
  }

  public void setUrlStandard(String urlStandard) {
    this.urlStandard = urlStandard;
  }

  public String getUrlThumbnail() {
    return urlThumbnail;
  }

  public void setUrlThumbnail(String urlThumbnail) {
    this.urlThumbnail = urlThumbnail;
  }

  public String getUrlTiny() {
    return urlTiny;
  }

  public void setUrlTiny(String urlTiny) {
    this.urlTiny = urlTiny;
  }
}
