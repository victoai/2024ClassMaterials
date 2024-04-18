package com.acorn.day3;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


@Component
public class DanService {
	
	
	public ArrayList<String> getDan( int dan){		
		ArrayList<String> danList = new ArrayList<>();		 
		for( int i=1 ; i<=9; i++) {
			danList.add(dan+"*" +i +"="+dan*i);  // " 3*1= 3 "
		}		 		 
		return danList;
		
	}

}
