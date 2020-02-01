package BaekJoon;

import java.util.Scanner;

public class P1406 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String t,a[]=s.next().split("");
		int n=s.nextInt(),i=a.length;
		for(;n-->0;) {
			switch(t=s.next()) {
			case "L":
				while(i>0)if(a[i-1]!=null)i--;
				break;
			case "D":
				while(i<a.length)if(a[i+1]!=null)i++;
				break;
			case "B":
				if(i!=0)a[i-1]=a[i-1].substring(0,a[i-1].length()-1);
				break;
			case "P":
				a[i]=s.next()+a[i];
				break;
			}
		}
		for(String j:a)System.out.print(j);
	}
}