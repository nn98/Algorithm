package _Algorithm.Stack;

import java.util.Arrays;

public class P2504_5 {

	public static void main(String[] args) {
		String[]a=new String[30];
		int i=0,r=0,v=0;
		for(String b:new java.util.Scanner(System.in).next().split("")) {
			try {
				switch(b) {
				case "(":
					a[i]=b;
					break;
				case "[":
					a[i]=b;
					break;
				case ")":
					if(a[i-1].equals("[")) {
						System.out.print(0);
						return;						
					}else if(a[i-1].equals("(")) {
						a[--i]="2";			
					}else {
						System.out.println("from "+i);
						while(!(a[--i].equals("(")))
							v+=Integer.parseInt(a[i]);
						System.out.println("to "+i);
						System.out.println(2+" * "+v);
						a[i]=""+v*2;
						v=0;
					}
					break;
				case "]":
					if(a[i-1].equals("(")) {
						System.out.print(0);
						return;
					}else if(a[i-1].equals("[")) {
						a[--i]="3";
					}else {
						while(!(a[--i].equals("[")))
							v+=Integer.parseInt(a[i]);
						System.out.println(3+" * "+v);
						a[i]=""+v*3;
						v=0;
					}
					break;
				}
				i++;
			}catch(Exception e) {
				System.out.print(0);
				return;
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println(i);
		System.out.println(Arrays.toString(a));
	}

}
