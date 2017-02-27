package com.samples;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Test {
	
	public static void main(String [] args){
		
		
		Date date = new Date(2017,10,20);

		
		Timestamp ts = new Timestamp(date.getTime()+10000);
		
		System.out.println(date.toString());
		System.out.println(ts.toString());
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		sdf.format(date);
		System.out.println(sdf.format(date));
		
	}

}
