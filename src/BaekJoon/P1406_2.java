package BaekJoon;

import java.util.Scanner;

public class P1406_2 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		String t,a[]=s.next().split("");
		int n=s.nextInt(),i=a.length;
		for(;n-->0;) {
			switch(t=s.next()) {
			case "L":
				if(i>0)i--;
				while(a[i]==null)i--;
				break;
			case "D":
//				while(i<a.length)if(a[i+1]!=null)i++;
				if(i<a.length)i++;
				if(i==a.length)break;
				while(a[i]==null)i++;
				break;
			case "B":
				if(i!=0)a[i-1]=a[i-1].substring(0,a[i-1].length()-1);
				break;
			case "P":
				if(i==a.length)a[i-1]+=s.next();
				else a[i]=s.next()+a[i];
				break;
			}
		}
		for(String j:a)System.out.print(j);
	}
}
