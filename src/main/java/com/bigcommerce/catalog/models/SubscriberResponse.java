package com.bigcommerce.catalog.models;

import java.util.LinkedList;
import java.util.List;

public class SubscriberResponse {

  private List<Subscriber> data = new LinkedList<>();

  private Meta meta = new Meta();

  public List<Subscriber> getData() {
    return data;
  }

  public void setData(List<Subscriber> data) {
    this.data = data;
  }

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }
}
