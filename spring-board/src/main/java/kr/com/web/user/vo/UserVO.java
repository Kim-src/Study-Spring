package kr.com.web.user.vo;

import lombok.Data;

@Data
public class UserVO {
	
	private String memId;
	private String memPassword;
	private String memName;
	private int memBirth;
	private String memGender;
	private String memEmail;
	private String memAddr;
	private String memAddrDetail;

}
