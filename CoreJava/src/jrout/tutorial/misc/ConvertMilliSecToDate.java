package jrout.tutorial.misc;

import java.util.Date;

public class ConvertMilliSecToDate {

	public static void main(String[] args) {
		long milli = 1462928931995L;
		Date date = new Date(milli);
		System.out.println(date);
		
		// 2016/05/10
	}

}
