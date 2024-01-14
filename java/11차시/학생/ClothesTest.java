

package com.acorn.kmj;

import day10.실습.ClothesInfo;

public class ClothesTest {

	public static void main(String[] args) {
		
		ClothesInfo clothes = new ClothesInfo();
		
		clothes.input("시티보이 빅오버 옥스포드 반팔 셔츠", " m1037_685374", 7405, 39800, 82);
		
		clothes.printInfo();
	}

}
