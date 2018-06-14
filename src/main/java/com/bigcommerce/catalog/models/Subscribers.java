package com.bigcommerce.catalog.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Subscribers {

  private final List<Subscriber> subscribers;
  private final Pagination pagination;

}
