package _Algorithm.Sweeping;

import java.util.Scanner;
import java.util.Stack;

public class P1725_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],m=0,j;
		Stack<Integer>k=new Stack();
		for(;i<n;i++) {
			a[i]=s.nextInt();
			while(!k.isEmpty()&&a[k.peek()]>a[i]) {
				j=k.pop();
				long w=i;
				if(!k.isEmpty())w-=k.peek()+1;
				long c=a[j]*w;
				m=(int) (m<c?c:m);
			}
			k.push(i);
		}
		while(!k.isEmpty()) {
			j=k.pop();
			long w=i;
			if(!k.isEmpty())w-=k.peek()+1;
			long c=a[j]*w;
			m=(int) (m<c?c:m);
		}
		System.out.println(m);
	}

}
