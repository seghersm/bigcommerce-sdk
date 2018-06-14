package com.bigcommerce.catalog.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class OrderHookResponse {

  @XmlElement(name = "scope")
  private String scope;

  @XmlElement(name = "hash")
  private String hash;

  @XmlElement(name = "producer")
  private String producer;

  @XmlElement(name = "data")
  private Data data;

  @XmlJavaTypeAdapter(DateTimeAdapter.class)
  @XmlElement(name = "created_at")
  private DateTime created_at;

  @XmlElement(name = "store_id")
  private String store_id;

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public DateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(DateTime created_at) {
    this.created_at = created_at;
  }

  public String getStore_id() {
    return store_id;
  }

  public void setStore_id(String store_id) {
    this.store_id = store_id;
  }

  @Override
  public String toString() {
    return "ClassPojo [scope = " + scope + ", hash = " + hash + ", producer = " + producer
        + ", data = " + data + ", created_at = " + created_at + ", store_id = " + store_id + "]";
  }

}
