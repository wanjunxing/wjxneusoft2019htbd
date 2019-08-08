package com.neusoft.htbd.customerservice.model;

import java.util.List;

import lombok.Data;
/*
 * 万俊星
 */
@Data
public class ComplianTypeModel {
    private Long typeNo;
	private String typeName;
	private List<HomeComplainModel> homeComplains;
	private List<HouseComplainModel> houseComplains;
	
}
