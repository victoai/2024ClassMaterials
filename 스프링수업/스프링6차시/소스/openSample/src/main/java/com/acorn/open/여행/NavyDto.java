package com.acorn.open.여행;

 
public class NavyDto {
	
	String continent;
	String countryName;
	String attentionNote;
	public NavyDto(String continent, String countryName, String attentionNote) {
		super();
		this.continent = continent;
		this.countryName = countryName;
		this.attentionNote = attentionNote;
	}
	@Override
	public String toString() {
		return "NavyDto [continent=" + continent + ", countryName=" + countryName + ", attentionNote=" + attentionNote
				+ "]";
	}
	
}
