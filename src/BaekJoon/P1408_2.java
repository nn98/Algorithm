package BaekJoon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class P1408_2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
		Date d1 = f.parse(s.nextLine());
		Date d2 = f.parse(s.nextLine());
		long idff=Math.abs(d2.getTime()-d1.getTime());
		long h=idff/3600000;
		idff%=3600000;
		long m=idff/60000;
		idff%=60000;
		long se=idff/1000;
		if(h<10) System.out.print("0"+h+":");
		else System.out.print(h+":");
		if(m<10) System.out.print("0"+m+":");
		else System.out.print(h+":");
		if(se<10) System.out.print("0"+se);
		else System.out.print(se);
	}
}