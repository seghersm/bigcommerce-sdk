package com.bigcommerce.catalog.models;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Subscriber {

	@XmlElement(name = "first_name")
	private String firstName;

	@XmlElement(name = "last_name")
	private String lastName;

	@XmlElement(name = "email")
	private String email;

	@XmlElement(name = "id")
	private int id;

	@XmlElement(name = "company")
	private String company;

	@XmlElement(name = "phone")
	private String phone;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "date_created")
	private String dateCreated;

	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "date_modified")
	private String dateModified;

	@XmlElement(name = "store_credit")
	private BigDecimal storeCredit;

	@XmlElement(name = "registration_ip_address")
	private String registrationIpAddress;

	@XmlElement(name = "customer_group_id")
	private int customerGroupId;

	@XmlElement(name = "notes")
	private String notes;

	@XmlElement(name = "tax_exempt_category")
	private String taxExemptCategory;

	@XmlElement(name = "reset_pass_on_login")
	private String resetPassOnLogin;

	@XmlElement(name = "accepts_marketing")
	private String acceptsMarketing;

}
