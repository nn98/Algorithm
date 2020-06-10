package _Algorithm.Sweeping;
// 히스토그램 크기 문제 기준으로.
// 배열 내용 싹 훑으면서 기준값보다 크거나 같으면 추가하고 계속, 작으면 거기까지 저장하고 작은값부터 새로?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	static int n,a[],m,M,j,i;

	public static void main(String[] args)throws Exception{
		//		My
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		for(String s:r.readLine().split(" "))a[i++]=Integer.parseInt(s);
		Stack<Integer>s=new Stack();
		i=0;
		m=a[i];
		s.add(m);
		for(;++i<n;) {
			j=a[i];
			if(j<m) {
				int x=0,y=0;
				while(!s.isEmpty()) {
					x++;
					s.pop();
				}
				y=x*m;
				m=j;
				s.add(m);
				M=M>y?M:y;
			}else {
				s.add(j);
			}
		}
		int x=0,y=0;
		while(!s.isEmpty()) {
			x++;
			s.pop();
		}
		y=x*m;
		M=M>y?M:y;
		System.out.println(M);
		i=M=0;

		//		Sol's
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		for(String g:r.readLine().split(" ")) {
			a[i]=Integer.parseInt(g);
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				int c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=a[c]*w;
				M=M>k?M:k;
			}
			s.push(i++);
		}
		if(i<n)
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				int c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=a[c]*w;
				M=M>k?M:k;
			}
		System.out.println(M);
	}

}
