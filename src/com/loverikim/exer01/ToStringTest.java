package com.loverikim.exer01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		Object ob1 = new Object();
		Date da1 = new Date(); // 여기서는 java.util 소속
		// 자동완성으로 불러올 때, 불러오려는 class의 소속을 확인해야 함. 
        
		System.out.println(ob1);
		System.out.println(da1);		
		
		System.out.println(ob1.toString());
		System.out.println(da1.toString());

	}

}

