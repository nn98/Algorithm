package _Contest.c819;
import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]a=r.readLine().split(":");
		int h=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),i=0,j,b[]=new int[6],e=0;
		double t=0;
		for(String s:r.readLine().split(" "))b[i++]=Integer.parseInt(s);
		j=Integer.parseInt(r.readLine());
		for(;j-->0;) {
			if(e>5)break;
			a=r.readLine().split(" ");
			t=Double.parseDouble(a[0]);
			if(t>60)break;
			switch(a[1]) {
			case "^":
				if(b[h/2]>0)e++;
				b[h/2]=0;
				break;
			case "10MIN":
				m+=10;
				break;
			case "30MIN":
				m+=30;
				break;
			case "50MIN":
				m+=50;
				break;
			case "2HOUR":
				h+=2;
				break;
			case "4HOUR":
				h+=4;
				break;
			case "9HOUR":
				h+=9;
			}
			h+=m/60;
			m%=60;
			h%=12;
			System.out.println(t+" "+h+" "+m);
		}
		i=0;for(int x:b)i+=x;
		for(j=i=0;i<6;j+=b[i++]);
		System.out.println(j);
//		System.out.println(Arrays.toString(b));
	}
}
