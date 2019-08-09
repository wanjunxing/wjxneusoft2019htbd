package com.neusoft.ht.systemoperatormanagement.model;

import java.util.List;

import com.neusoft.ht.systemconfiguration.model.UserInfoModel;

import lombok.Data;

@Data
public class UserModel {

	private String uUserID;
	private String uPassword;
	private String uName;
	private List<UserInfoModel> userInfos;
}
