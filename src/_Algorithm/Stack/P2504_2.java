package _Algorithm.Stack;

import java.util.Stack;

public class P2504_2 {

	public static void main(String[] args) {
		char b;
		int c=0,d=0,r=0;
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
				if(b=='[') {
					System.out.print(0);
					return;
				}
				if(c==0)c=2;
				else {
					if(d!=0)c+=d;
					c*=2;
				}
				if(s.isEmpty())
				break;
			case ']':
				b=s.pop();
				if(b=='(') {
					System.out.print(0);
					return;
				}
				break;
			}
		}
	}

}
