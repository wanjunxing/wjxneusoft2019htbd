package com.neusoft.ht.customerservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.ht.customerservice.model.ComplainTypeModel;

@Mapper
public interface IComplainTypeMapper {

	public void create(ComplainTypeModel complainType) throws Exception;

	public void update(ComplainTypeModel complainType) throws Exception;

	public void delete(ComplainTypeModel complainType) throws Exception;

	public List<ComplainTypeModel> selectComplianTypeModelByAll() throws Exception;

	public ComplainTypeModel selectComplianTypeModelByTypeNo(long typeNo) throws Exception;
	
}
