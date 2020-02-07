package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class P3986 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=0,i,j;
		while(n-->0) {
			Stack<String>t=new Stack();
			String[]a=s.next().split("");
			j=a.length;
			for(i=0;i<j;i++) {
				if(t.isEmpty()||!t.peek().equals(a[i]))t.push(a[i]);
				else t.pop();
			}
			r+=i==j&&t.isEmpty()?1:0;
//			if(i==j&&t.isEmpty())r++;
		}
		System.out.print(r);
	}

}
