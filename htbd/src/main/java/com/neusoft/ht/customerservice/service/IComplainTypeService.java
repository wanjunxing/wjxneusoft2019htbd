package com.neusoft.ht.customerservice.service;

import java.util.List;

import com.neusoft.ht.customerservice.model.ComplainTypeModel;


public interface IComplainTypeService {

	public void add(ComplainTypeModel complianType) throws Exception;

	public void modify(ComplainTypeModel complainType) throws Exception;

	public void delete(ComplainTypeModel complainType) throws Exception;

	public List<ComplainTypeModel> getListByAll() throws Exception;

	public ComplainTypeModel getComplainTypeBytypeNo(long typeNo) throws Exception;


}
