package com.FinalProject.controller;

 
 

 
public class BlackDto {

	String continent;
	String countryName;
	public BlackDto(String continent, String countryName) {
		super();
		this.continent = continent;
		this.countryName = countryName;
	}
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
	@Override
	public String toString() {
		return "BlackDto [continent=" + continent + ", countryName=" + countryName + "]";
	}
	
	
	
}
