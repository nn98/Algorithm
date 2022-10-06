package SWPJ_2022;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		Timestamp ts=new Timestamp(System.currentTimeMillis()),ds=new Timestamp(1663203965);  
        Date d0=new Date(ts.getTime()),d1=new Date(ds.getTime());  
        System.out.println(d0);
        System.out.println(d1);
	}

}
