package com.neusoft.htdb.customerservice.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("ComplainType")
@Data
public class ComplainTypeModel {
    private Long typeNo;
	private String typeName;
	private List<HomeComplainModel> homeComplains;
	private List<HouseComplainModel> houseComplains;
	
}
