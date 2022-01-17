package Generic;

import java.util.Date;
import java.util.Random;

public class javautility {
	/**
	 * used to generate random number
	 */
	public int getrandomnumber() {
		Random random=new Random();
		int ranDom=random.nextInt(1000);
		return ranDom;
		
	}
	public int getRanpassword() {
		Random random=new Random();
		int ranDom=random.nextInt(100000000);
		return ranDom;
	}
	/**
	 * used to get the system date and time
	 * @return
	 */
	public String getsystemdate() {
		Date date=new Date();
		String currentdate = date.toString();
		return currentdate;
		
	}
	public String getsystemdateYYYY_MM_DD_formate() {
		Date date=new Date();
		String currentdate = date.toString();
		System.out.println(currentdate);//ex: Mon Jan 10 15:31:14 IST 2022
		String [] datearray=currentdate.split(" ");
		String YYYY=datearray[5];//ex: Mon[0] Jan 10 15:31:14 IST 2022
		String MM=datearray[1];
		String DD=datearray[2];
		String finalformat=YYYY+" "+MM+" "+DD;
		System.out.println(finalformat);
		return finalformat;
		
		
	}

}
