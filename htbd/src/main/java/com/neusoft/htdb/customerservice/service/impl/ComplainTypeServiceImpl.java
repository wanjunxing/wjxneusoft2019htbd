package com.neusoft.htdb.customerservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.htdb.customerservice.mapper.IComplainTypeMapper;
import com.neusoft.htdb.customerservice.model.ComplainTypeModel;
import com.neusoft.htdb.customerservice.service.IComplainTypeService;

@Service("ComplainTypeService")
public class ComplainTypeServiceImpl implements IComplainTypeService {

	@Autowired
	private IComplainTypeMapper complainTypeMapper;
	
	@Override
	public void add(ComplainTypeModel complianType) throws Exception {
		complainTypeMapper.create(complianType);
	}

	@Override
	public void modify(ComplainTypeModel complainType) throws Exception {
		complainTypeMapper.update(complainType);
    }

	@Override
	public void delete(ComplainTypeModel complainType) throws Exception {
		complainTypeMapper.delete(complainType);
	}

	@Override
	public List<ComplainTypeModel> getListByAll() throws Exception {
		return complainTypeMapper.selectComplianTypeModelByAll();
	}

	@Override
	public ComplainTypeModel getComplainTypeBytypeNo(long typeNo) throws Exception {
		return complainTypeMapper.selectComplianTypeModelByTypeNo(typeNo);
	}

}
