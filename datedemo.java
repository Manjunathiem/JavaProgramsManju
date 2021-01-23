package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/DD/YYYY");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY/SS");
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
