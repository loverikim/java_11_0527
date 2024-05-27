package com.loverikim.exer01;

public class StringTest02 {

	public static void main(String[] args) {
		
		String str1 = "오늘은 자바 프로그래밍!!";
		
		// 문자열 대치		
		String str2 = str1.replace("자바", "파이썬");
//		String str2 = str1.replace("Java", "파이썬");
		//못찾으면 아무것도 안바뀌고 원본 문자열 반환
	
		System.out.println(str1);
		System.out.println(str2);
		
		// 문자열 슬라이싱
		String ssn = "880815-1234567";
		
		System.out.println(ssn.substring(7)); //ss[7:]
		System.out.println(ssn.substring(7,9)); //ss[7:9]
		
		String no1 = "10";
		String no2 = "3.14";
		
		//**********
		int num1 = Integer.parseInt(no1); //문자열 -> 정수
		//**********
		
		double num2 = Double.parseDouble(no2); //문자열-> 실수
		
		
		System.out.println(num1/2);
		System.out.println(num2/2);
		
		int val1 = 112;
		String strVal1 = String.valueOf(val1); //정수 -> 문자열
		System.out.println(val1);
		
		double val2 = 3.141592;
		String strVal2 = String.valueOf(val2);// 실수 -> 문자열
		System.out.println(val2);

	}

}
