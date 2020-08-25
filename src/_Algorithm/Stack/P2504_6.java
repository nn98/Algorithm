package _Algorithm.Stack;
public class P2504_6{
	public static void main(String[] args) {
		String[]a=new String[32];
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
						while(!(a[--i].equals("(")))
							v+=Integer.parseInt(a[i]);
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
		}
		try {
		while(i-->0)v+=Integer.parseInt(a[i]);
		}catch(Exception e) {
			v=0;
		}
		System.out.println(v);
	}
}