package com.loverikim.exer01;

public class SystemTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2가지
		// 둘다 현재시간을 가져옴
		// 반환타입 long(int보다 큰 정수, int는 21억밖에 못 찍음 )
		// 앞에 반환 타입 써줘야 함
		long nTime = System.nanoTime(); //현재시간을 나노단위 1/1000000000 초, 10의 9승분의 1초
		long cTime = System.currentTimeMillis(); //현재시간을 1/1000 초
		
		System.out.println(nTime);// 439008271385200 조로 반환
		System.out.println(cTime);// 1716772795900
		
		long t1 = System.currentTimeMillis(); //start time
		long n1 = System.nanoTime(); //현재시간을 나노 단위 1/1000000000초
		
		int sum=0;
		for(int i=1;i<=100000000;i++) {// 1~100000000까지의 합
			sum+=i;
		}
		
		long t2 = System.currentTimeMillis(); //end time
		long n2 = System.nanoTime(); //현재시간을 나노 단위 1/1000000000초
		
		System.out.println(t2-t1); //1~100000000까지의 합을 구하는데 걸린 시간
		System.out.println(n2-n1); //1~100000000까지의 합을 구하는데 걸린 시간
	}

}
