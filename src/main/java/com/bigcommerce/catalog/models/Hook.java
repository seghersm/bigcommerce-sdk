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
public class Hook
{
	@XmlElement(name = "id")
	private Integer id;

	@XmlElement(name = "scope")
    private String scope;

	@XmlElement(name = "is_active")
    private Boolean is_active;

	@XmlElement(name = "destination")
    private String destination;
	
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "updated_at")
	private DateTime updated_at;
	
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	@XmlElement(name = "created_at")
	private DateTime created_at;
	
	public Integer getId ()
    {
        return id;
    }

    public void setId (Integer id)
    {
        this.id = id;
    }

    public String getScope ()
    {
        return scope;
    }

    public void setScope (String scope)
    {
        this.scope = scope;
    }

    public Boolean getIs_active ()
    {
        return is_active;
    }

    public void setIs_active (Boolean is_active)
    {
        this.is_active = is_active;
    }

    public String getDestination ()
    {
        return destination;
    }

    public void setDestination (String destination)
    {
        this.destination = destination;
    }
    
    public DateTime getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (DateTime created_at)
    {
        this.created_at = created_at;
    }
    
    public DateTime getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (DateTime updated_at)
    {
        this.updated_at = updated_at;
    }

}
