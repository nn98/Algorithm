package _Algorithm.String;

import java.util.Scanner;

public class P8595 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,f=0,t,r=0,c=0;
		String a=s.next();
		for(;i<n;i++) {
			if(c>0)
				if(a.charAt(i)>='0'&&a.charAt(i)<='9')continue;
				else {
					r+=Integer.parseInt(a.substring(f,i));
					c=0;
				}
			else
				if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
					f=i;
					c=1;
				}
				
		}
		System.out.println(i);
		System.out.println(a.substring(f,i));
		if(c>0)r+=Integer.parseInt(a.substring(f,i));
		System.out.print(r);
	}
}