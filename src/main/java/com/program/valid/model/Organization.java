package com.program.valid.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer orgId;
	
	@NotBlank(message ="Name musy be Required")
	@Column
	private String orgName;
	
	@Column
	@Min(value = 100, message="Collection should be more than 100")
	private double orgCollection;
	
	@Email(message="Mail must be proper way and Required")
	@Column
	private String orgEmail;

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(Integer orgId, @NotBlank(message = "Name musy be Required") String orgName,
			double orgCollection, @Email(message = "Mail must be proper way and Required") String orgEmail) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgCollection = orgCollection;
		this.orgEmail = orgEmail;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public double getOrgCollection() {
		return orgCollection;
	}

	public void setOrgCollection(double orgCollection) {
		this.orgCollection = orgCollection;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", orgCollection=" + orgCollection
				+ ", orgEmail=" + orgEmail + "]";
	}

	
}
