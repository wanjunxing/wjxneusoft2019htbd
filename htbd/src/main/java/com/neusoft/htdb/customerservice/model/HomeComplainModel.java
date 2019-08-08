package com.neusoft.htdb.customerservice.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class HomeComplainModel {

	private Long complainNo;
	private Home homes;
	private ComplainTypeModel complianTypes;
	private String complainTitle; 
	private String complainContent;
	private String requestContent;
	private Date complainDate;
	private String contactPerson; 
	private String tel;
	private String mobile;
	private String mail; 
	private String qq;
	private Date serviceStartDate;
	private Date serviceEndDate;
	private String serviceContext;
	private String servicePerson;
	private Date feedBackDate;
	private String homeComment;
	private Date assuranceDate;
	private BigDecimal assuranceFee;
	private Date assurancePayDate;
	private String complainStatus;
}
