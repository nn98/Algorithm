package _Algorithm.Stack;

import java.util.Stack;

public class P2504_4 {

	public static void main(String[] args) {
		System.out.println((int)'(');
		System.out.println((int)')');
		System.out.println((int)'[');
		System.out.println((int)']');
		Stack<Character>s=new Stack();
		int b;
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
				if(b=='[') {
					System.out.print(0);
					break;
				}
				break;
			case ']':
				b=s.pop();
				if(b=='(') {
					System.out.print(0);
					break;
				}
				break;
			}
		}
	}

}
