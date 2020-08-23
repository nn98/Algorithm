package _Algorithm.Stack;

import java.util.Stack;

public class P2504 {

	public static void main(String[] args) {
		int c=0,d=0,r=0,v=0,f=0;
		Stack<Character>s=new Stack();
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			System.out.println(a+" "+v);
			switch(a) {
			case '(':
				c++;
				break;
			case '[':
				d++;
				break;
			case ')':
				c--;
				if(f==0) f=2;
				else f*=2;
				v+=f;
				if(c==0&d==0) {
					r+=v;
					v=0;
				}
				break;
			case ']':
				d--;
				if(f==0) f=3;
				else f*=3;
				v+=f;
				if(c==0&d==0) {
					r+=v;
					v=0;
				}
				break;
			}
		}
		System.out.print(r+v);
	}

}
