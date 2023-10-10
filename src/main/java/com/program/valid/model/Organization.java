package com.program.valid.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer orgId;
	
	@NotBlank(message ="Name musy be required")
	@Column
	private String orgName;
	
	//@NotEmpty
	@Column
	private double orgColletion;
	
	@Email(message="Mail must be proper way and required")
	@Column
	private String orgEmail;

	public Organization(Integer orgId, @NotBlank @Size(min = 2, message = "Name must be required") String orgName,
			@NotBlank @Size(min = 1, message = "Collection must be required") double orgColletion,
			@Email(message = "Mail must be required") String orgEmail) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgColletion = orgColletion;
		this.orgEmail = orgEmail;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getOrgColletion() {
		return orgColletion;
	}

	public void setOrgColletion(double orgColletion) {
		this.orgColletion = orgColletion;
	}

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", orgColletion=" + orgColletion
				+ ", orgEmail=" + orgEmail + "]";
	}
	
	

}
