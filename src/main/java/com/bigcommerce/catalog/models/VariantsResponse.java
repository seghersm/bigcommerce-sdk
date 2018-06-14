package com.bigcommerce.catalog.models;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VariantsResponse {

  private List<Variant> data = new LinkedList<>();
  private Meta meta = new Meta();

  public List<Variant> getData() {
    return data;
  }

  public void setData(List<Variant> data) {
    this.data = data;
  }

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

}
