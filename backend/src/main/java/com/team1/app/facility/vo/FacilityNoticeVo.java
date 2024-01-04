package com.team1.app.facility.vo;

import lombok.Data;

@Data
public class FacilityNoticeVo {
	private String facilitiesNoticeNo;
	private String facilitiesNo;
	private String managerNo;
	private String title;
	private String content;
	private String enrollDate;
	private String modifyDate;
	private String delYn;
	private String fileName;
	private String fileNameRaw;
}
