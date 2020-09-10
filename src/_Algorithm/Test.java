package _Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	//	20-09-06 1. BackTracking

	static int n,m,i,j,k,a[],h[];

	//	Duplicate

	static void o(int x) {

		if(x==m) {
			for(int b:a)
				System.out.print(b==0?"":b+" ");
			System.out.println();
		}

		else {
			for(int y=0;y<n;a[x]=++y,o(x+1));
		}

	}

	//	N-Duplicate

	static void p(int x) {

		if(x==m) {
			for(int b:a)
				System.out.print(b==0?"":b+" ");
			System.out.println();
		}

		else {
			for(int y=1;y<=n;y++) {
				if(h[y]>0)continue;
				a[x]=y;
				h[y]=1;
				p(x+1);
				h[y]=0;
			}
		}

	}

	//	20-09-08 2. Segment Tree

	static int tree[],value,num,size=1,half,temp;

	static int getSeg(int n,int l,int r,int f,int t) {

		return 0;

	}
	
	static void setSeg() {
		
		while(temp>0) {
			
			tree[temp/2]=temp%2==1?tree[temp]+tree[temp+1]:tree[temp]+tree[temp-1];
			
			temp/=2;
			
		}
		
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		String[]Task= {"BackTracking","Segment Tree"};
		
		while(n++<Task.length) System.out.println(n+". "+Task[n-1]);

		System.out.print("Task:\t");
		
		switch(s.nextInt()) {

		case 1: //	1. BackTracking

			System.out.println("1. BackTracking_");

			System.out.print("Number:\t");
			n=s.nextInt();

			System.out.print("Count:\t");
			m=s.nextInt();

			a=new int[n];

			h=new int[n+1];

			o(0);

			System.out.println();

			p(0);

			System.out.println();

			break;

		case 2:	//	2. Segment Tree

			System.out.println("2. Segment Tree_");

			System.out.print("Number:\t");
			num=s.nextInt();

			while(half<num) {
				half=size;
				size*=2;
			}

			System.out.println(size+"\t"+half);
			
			System.out.println("value_");
			
			tree=new int[size-1];
			
			half--;
			
			while(temp<num)tree[temp+++half]=s.nextInt();
			
			System.out.println(Arrays.toString(tree));
			
			for(int i=0;i<n;temp=i+half,setSeg(),i++);
			
			System.out.println(Arrays.toString(tree));

			break;

		}

	}

}
