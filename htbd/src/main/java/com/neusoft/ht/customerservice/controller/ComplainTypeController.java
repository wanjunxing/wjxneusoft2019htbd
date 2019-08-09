package com.neusoft.ht.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ht.customerservice.model.ComplainTypeModel;
import com.neusoft.ht.customerservice.service.IComplainTypeService;


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
	public String addComplainType(ComplainTypeModel complainType) throws Exception {
		complainTypeService.add(complainType);
		return "add OK";
	}
	
	@RequestMapping("/delete")
	public String deleteComplainType(ComplainTypeModel complainType) throws Exception{
		complainTypeService.delete(complainType);
		return "delete OK";	
	}
	
	@RequestMapping("/modify")
	public String modifyComplainType(ComplainTypeModel complainType) throws Exception{
		complainTypeService.modify(complainType);
		return "modify OK";
	}
	
	@RequestMapping("/getBytypeNo")
	public ComplainTypeModel getComplainType() throws Exception {
		return complainTypeService.getComplainTypeBytypeNo(3);
	}
}
