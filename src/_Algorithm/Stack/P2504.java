package _Algorithm.Stack;

import java.util.Stack;

public class P2504 {

	public static void main(String[] args) {
		int c=0,d=0,r=0,v=0,p=0,f=0;
		Stack<Character>s=new Stack();
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			switch(a) {
			case '(':
				if(f>0) {
					p+=f;
					f=0;
				}
				c++;
				break;
			case '[':
				if(f>0) {
					p+=f;
					f=0;
				}
				d++;
				break;
			case ')':
				c--;
				if(f==0) f=2;
				else f*=2;
				if(c==0&d==0) {
					v+=f;
					f=0;
				}
				break;
			case ']':
				d--;
				if(f==0) f=3;
				else f*=3;
				if(c==0&d==0) {
					v+=f;
					f=0;
				}
				break;
			}
			System.out.println(a+" "+v);
		}
		System.out.print(r+v);
	}

}
