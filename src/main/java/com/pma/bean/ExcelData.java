package com.pma.bean;

public class ExcelData {

	// 路段代碼
	private String section_id;
	// 區組名稱
	private String section_name;
	// 路段代碼
	private String road_id;
	// 路段名稱
	private String road_name;
	// 車格位代碼
	private String ps_id;
	// 地磁狀態
	private String staaus;
	// 裝置代碼
	private String device_id;

	public String getSection_id() {
		return section_id;
	}

	public void setSection_id(String section_id) {
		this.section_id = section_id;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public String getRoad_id() {
		return road_id;
	}

	public void setRoad_id(String road_id) {
		this.road_id = road_id;
	}

	public String getRoad_name() {
		return road_name;
	}

	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}

	public String getPs_id() {
		return ps_id;
	}

	public void setPs_id(String ps_id) {
		this.ps_id = ps_id;
	}

	public String getStaaus() {
		return staaus;
	}

	public void setStaaus(String staaus) {
		this.staaus = staaus;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

}
