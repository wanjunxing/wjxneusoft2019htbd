package com.neusoft.ht.systemconfiguration.model;

import java.util.List;

import com.neusoft.ht.systemoperatormanagement.model.UserModel;

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
