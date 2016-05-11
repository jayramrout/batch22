package jrout.tutorial.stringexample;

import java.util.Date;

public class StringExample {

	public static void main(String[] args) {
		StringExample se = new StringExample();
//		se.simpleString();
		se.stringBuffer();
		se.stringBuilder();
		
		long time = System.currentTimeMillis();
		System.out.println(new Date());
	}
	
	public void simpleString(){
		String finalValue = "";
		for(int i = 0 ; i < 10 ; i++){
			finalValue += i;		// 0   01 012 0123  01234 012345 0123456 ... 
		}
		
		System.out.println(finalValue);
	}
	
	public void stringBuffer(){
		StringBuffer sb = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++){
			sb.append(i); 
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("String Buffer time = "+ (endTime-startTime));
		System.out.println(sb.toString());
	}
	
	
	public void stringBuilder(){
		StringBuilder sb = new StringBuilder();
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++){
			sb.append(i); 
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String Builder time = "+ (endTime-startTime));
		System.out.println(sb.toString());
	}
	
	
}
