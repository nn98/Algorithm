package _Algorithm.Stack;

import java.util.*;

public class P2493_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,k=1;
		Stack<Integer>t=new Stack(),x=new Stack();
		for(;i++<n;) {
			j=s.nextInt();
			while(!t.isEmpty())
				if(t.peek()<j) {
					t.pop();
					x.pop();
				}else break;
			if(t.isEmpty()) {
				t.push(j);
				System.out.print(0+" ");
				x.push(i);
			}else {
				t.push(j);
				System.out.print(x.peek()+" ");
				x.push(i);
			}
		}
	}

}
