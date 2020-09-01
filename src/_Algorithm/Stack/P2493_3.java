package _Algorithm.Stack;

import java.util.Scanner;
import java.util.Stack;

public class P2493_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=n-1,k,v,r[]=new int[n];
		Stack<Integer> a=new Stack(),b=new Stack();
		for(;i<n;i++)a.push(s.nextInt());
		while(!a.isEmpty()&!b.isEmpty()) {
			System.out.println(a+"\t"+b);
			if(a.isEmpty()) {
				System.out.println(0);
				while(b.isEmpty()) {
					r[j--]=0;
					b.pop();
				}
			}
			else if(b.isEmpty()) {
				System.out.println(1);
				b.push(a.pop());
			}else {
				System.out.println(2);
				k=a.pop();
				while(b.peek()<=k) {
					r[j--]=n;
					b.pop();
				}
				b.push(k);
			}
			n--;
		}
		for(int c:r)System.out.print(c+" ");
	}

}
