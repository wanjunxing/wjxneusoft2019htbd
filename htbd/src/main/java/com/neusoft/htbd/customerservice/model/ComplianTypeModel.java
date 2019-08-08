package com.neusoft.htbd.customerservice.model;

import java.util.List;

import lombok.Data;

@Data
public class ComplianTypeModel {
    private Long typeNo;
	private String typeName;
	private List<HomeComplainModel> homeComplains;
	private List<HouseComplainModel> houseComplains;
	
}
