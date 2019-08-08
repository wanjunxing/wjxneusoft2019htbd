package com.neusoft.htdb.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.htdb.customerservice.model.ComplainTypeModel;
import com.neusoft.htdb.customerservice.service.IComplainTypeService;


@RestController
@RequestMapping("/complaintype")
public class ComplainTypeController {

	@Autowired
	private IComplainTypeService complainTypeService;

	@RequestMapping("/list")
	public List<ComplainTypeModel> getComplainTypeList() throws Exception {
		return complainTypeService.getListByAll();
	}
	
	@RequestMapping("/add")
	public void addComplainType(ComplainTypeModel complainType) throws Exception {
		complainTypeService.add(complainType);
	}
}
