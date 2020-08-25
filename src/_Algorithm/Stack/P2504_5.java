package _Algorithm.Stack;

import java.util.Arrays;

public class P2504_5 {

	public static void main(String[] args) {
		String[]a=new String[30];
		int i=0,r=0,v;
		for(String b:new java.util.Scanner(System.in).next().split("")) {
			try {
				switch(b) {
				case "(":
					a[i++]=b;
					break;
				case "[":
					a[i++]=b;
					break;
				case ")":
					if(a[i-1].equals("[")) {
						System.out.print(0);
						return;						
					}else if(a[i-1].equals("(")) {
						a[--i]="2";			
					}else {
						v=Integer.parseInt(a[i-1]);
						a[--i]=""+v*2;				
					}
					break;
				case "]":
					if(a[i-1].equals("(")) {
						System.out.print(0);
						return;
					}else if(a[i-1].equals("[")) {
						a[--i]="3";
					}else {
						v=Integer.parseInt(a[i-1]);
						a[--i]=""+v*3;
					}
					break;
				}
			}catch(Exception e) {
				System.out.print(0);
				return;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
