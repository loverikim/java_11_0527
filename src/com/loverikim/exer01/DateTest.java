package com.loverikim.exer01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// DATE 클래스
		Date now = new Date();
		
		String strNow1 = now.toString();
		
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2= sdf.format(now);
		System.out.println(strNow2);
		
		// Calendar 클래스
		//Calendar now2 = new Calendar();//추상클래스이므로 인스턴스 생성 불가 -> 에러발생
		// 인스턴스 생성 불가 추상 클래스는 메모리에 만들 수 없다. new 연산자 사용불가
		Calendar now2 = Calendar.getInstance();// 인스턴스 생성,  싱글 톤 배울 때 
		
		int year = now2.get(Calendar.YEAR);		
		System.out.println(year);		
		
		int month = now2.get(Calendar.MONTH)+1;	//0부터 시작 	
		System.out.println(month);
		
		int day = now2.get(Calendar.DAY_OF_MONTH);		
		System.out.println(day);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);		
		System.out.println(week);
		
		int ampm = now2.get(Calendar.AM_PM);		
		System.out.println(ampm);
	}

}
