package BaekJoon.Stack;

import java.util.Stack;

public class P2504_4 {

	public static void main(String[] args){
		Stack<Integer> s=new Stack();
		int b,r=0;
		for(char a:new java.util.Scanner(System.in).next().toCharArray()) {
			switch(a) {
			case '(':
				s.push((int) a);
				break;
			case '[':
				s.push((int) a);
				break;
			case ')':
				b=s.pop();
				if(b=='[') {
					System.out.print(0);
					return;
				}
				b=s.peek();
				if(b=='('||b=='[')
					s.push(2);
				else {
					do {
						r+=b;
						b=s.pop();
					}while(b!='('||b!='[');
					s.push(b);
					s.push(r*2);
				}
				break;
			case ']':
				b=s.pop();
				if(b=='[') {
					System.out.print(0);
					return;
				}
				b=s.peek();
				if(b=='('||b=='[')
					s.push(3);
				else {
					do {
						r+=b;
						b=s.pop();
					}while(b!='('||b!='[');
					s.push(b);
					s.push(r*3);
				}
				break;

			}
			System.out.println(s.peek());
		}
		System.out.print((int)s.pop());
	}
}