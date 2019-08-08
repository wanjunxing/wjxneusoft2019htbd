package com.neusoft.htbd.systemconfiguration.model;

import java.util.List;

import com.neusoft.htbd.systemoperatormanagement.model.UserModel;

import lombok.Data;

@Data
public class UserInfoModel {

	private List<UserModel> users;
	private String sex;
	private Integer age;
	private Byte[] photo;
	private String photoFileName;
	private String photoContentType;
	private List<FunctionModel> functions;
}
