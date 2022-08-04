package Programmers.Stack;
import java.util.*;
public class P76502 {
	static public int solution(String s) {
		StringBuffer f=new StringBuffer(s);
		int l=f.length(),i=0,j,r=0,g;
		for(;i<l;i++) {
			g=0;
			Stack<Character>t=new Stack();
			for(j=i;j<i+l&g<1;j++) {
				switch(f.charAt(j%l)) {
				case ')':
					if(t.peek()=='(')t.pop();
					else g++;
					break;
				case '}':
					if(t.peek()=='{')t.pop();
					else g++;
					break;
				case ']':
					if(t.peek()=='[')t.pop();
					else g++;
					break;
				case '(':
					t.push('(');
					break;
				case '{':
					t.push('{');
					break;
				case '[':
					t.push('[');
				}
			}
			if(!t.isEmpty())g++;
			r+=g<1?1:0;
		}
		return r;
    }
	public static void main(String[]z) {
		System.out.println(solution("[({})]"));
	}
}
