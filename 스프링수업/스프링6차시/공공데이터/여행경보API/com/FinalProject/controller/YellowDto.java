package com.FinalProject.controller;
 
public class YellowDto {

	String continent;
	String countryName;
	String controlNote;
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getControlNote() {
		return controlNote;
	}
	public void setControlNote(String controlNote) {
		this.controlNote = controlNote;
	}
	public YellowDto(String continent, String countryName, String controlNote) {
		super();
		this.continent = continent;
		this.countryName = countryName;
		this.controlNote = controlNote;
	}
	
	public YellowDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "YellowDto [continent=" + continent + ", countryName=" + countryName + ", controlNote=" + controlNote
				+ "]";
	}
	
}
