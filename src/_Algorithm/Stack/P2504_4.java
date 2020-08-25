package _Algorithm.Stack;

import java.util.Stack;

public class P2504_4 {

	public static void main(String[] args){
		Stack<Character> s=new Stack();
		s.pop();
		int b,r=0;
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			try {
			switch(a) {
			case '(':
				s.push(a);
				break;
			case '[':
				s.push(a);
				break;
			case ')':
				b=(char)s.pop();
				if(b=='[') {
					System.out.print(0);
					break;
				}
				b=(char)s.peek();
				if(b=='('||b=='[')
					s.push((char) 2);
				else
					s.push((char) ((int)s.pop()*2));
				break;
			case ']':
				b=(char)s.pop();
				if(b=='[') {
					System.out.print(0);
					break;
				}
				b=(char)s.peek();
				if(b=='('||b=='[')
					s.push((char) 3);
				else
					s.push((char) ((int)s.pop()*3));
				break;
			}
			}catch(Exception e) {
				System.out.print(0);
			}
		}
		System.out.print((int)s.pop());
	}

}
