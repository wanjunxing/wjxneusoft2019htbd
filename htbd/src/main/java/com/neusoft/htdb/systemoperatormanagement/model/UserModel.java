package com.neusoft.htdb.systemoperatormanagement.model;

import java.util.List;

import com.neusoft.htdb.systemconfiguration.model.UserInfoModel;

import lombok.Data;

@Data
public class UserModel {

	private String uUserID;
	private String uPassword;
	private String uName;
	private List<UserInfoModel> userInfos;
}
