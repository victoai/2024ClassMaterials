package com.FinalProject.controller;

 
 
 
public class RedDto {

	String continent;
	String countryName;
	String limitaNote;
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
	public String getLimitaNote() {
		return limitaNote;
	}
	public void setLimitaNote(String limitaNote) {
		this.limitaNote = limitaNote;
	}
	@Override
	public String toString() {
		return "RedDto [continent=" + continent + ", countryName=" + countryName + ", limitaNote=" + limitaNote + "]";
	}
	public RedDto(String continent, String countryName, String limitaNote) {
		super();
		this.continent = continent;
		this.countryName = countryName;
		this.limitaNote = limitaNote;
	}
	
	public RedDto() {
		// TODO Auto-generated constructor stub
	}
	
}
