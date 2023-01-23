package BaekJoon._Before_Tagging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class P10699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		//DD�� �� ���ڰ� �ٴ���?
		SimpleDateFormat sd=new SimpleDateFormat("YYYY-MM-DD");
		sd.setTimeZone(TimeZone.getTimeZone("Korea/Seoul"));
		System.out.println(sd.format(d));
	}
}
