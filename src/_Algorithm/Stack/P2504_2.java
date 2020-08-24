package _Algorithm.Stack;

import java.util.Stack;

public class P2504_2 {

	public static void main(String[] args) {
		char b;
		int c=0,d=0,r=0,v=0,p=0,f=0;
		Stack<Character>s=new Stack();
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			switch(a) {
			case '(':
				s.push(a);
				break;
			case '[':
				s.push(a);
				break;
			case ')':
				b=s.pop();
				break;
			case ']':
				b=s.pop();
				break;
			}
			System.out.println(a+" "+v);
		}
		System.out.print(r+v);
	}

}
