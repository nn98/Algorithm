package _Algorithm.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P2493_5 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
//		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(r.readLine()),i=0,j;
		StringBuffer f=new StringBuffer();
		StringTokenizer z=new StringTokenizer(r.readLine());
		Stack<Integer>t=new Stack(),x=new Stack();
		for(;i++<n;) {
			j=Integer.parseInt(z.nextToken());
			while(!t.isEmpty())
				if(t.peek()<j) {
					t.pop();
					x.pop();
				}else break;
			if(t.isEmpty()) {
				t.push(j);
//				System.out.print(0+" ");
				f.append(0+" ");
				x.push(i);
			}else {
				t.push(j);
//				System.out.print(x.peek()+" ");
				f.append(x.peek()+" ");
				x.push(i);
			}
		}
		System.out.print(f);
	}

}
