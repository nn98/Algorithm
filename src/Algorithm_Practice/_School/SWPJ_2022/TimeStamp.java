package Algorithm_Practice._School.SWPJ_2022;

import java.sql.Timestamp;
import java.util.*;
import java.io.*;

public class TimeStamp {

	public static void main(String[] args)throws Exception{
		System.out.println(System.currentTimeMillis());
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		for(;;) {
			Date d=new Date(ts.getTime());
			System.out.println(d);
			long l=Long.parseLong(r.readLine())*1000;
			if(l<1)break;
			ts=new Timestamp(l);
		}
	}

}
