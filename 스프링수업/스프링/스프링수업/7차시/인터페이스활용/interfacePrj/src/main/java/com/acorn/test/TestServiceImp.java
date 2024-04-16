package com.acorn.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImp implements TestServiceI {
	/* 
	public static void main(String[] args) {
		TestServiceImp  s = new TestServiceImp();
		double[] result = s.위도경도가지오기();
		
	}
	*/
	
	@Autowired
	 GoogleApi  api;
 	
	
	@Autowired
	TestRepository  repository;	
	 

	@Override
	public double[] 위도경도가지오기() {		  
		double[] result  = api.위도경도구하기();
		return result;
	}
	

	@Override
	public int registerMember( Member member) {	  
		double[] result  = 위도경도가지오기();		
		System.out.println( result[0] + " : " + result[1]);		 
		member.setLatitude( result[0]);
		member.setLongitude( result[1]);
		repository.insertMember(member);	 
		return 1;
	}

}
