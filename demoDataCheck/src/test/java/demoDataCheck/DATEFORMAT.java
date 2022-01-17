package demoDataCheck;

import java.util.Date;

public class DATEFORMAT {public static void main(String[] args) {
		Date date=new Date();
		String currentdate = date.toString();
		System.out.println(currentdate);//ex: Mon Jan 10 15:31:14 IST 2022
		String [] datearray=currentdate.split(" ");
		String YYYY=datearray[5];//ex: Mon[0] Jan 10 15:31:14 IST 2022
		String MM=datearray[1];
		String DD=datearray[2];
		String finalformat=YYYY+" "+MM+" "+DD;
		System.out.println(finalformat);
		
		
	}
}

