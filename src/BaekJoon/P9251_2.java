package BaekJoon;

import java.util.Scanner;

public class P9251_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] a=s.nextLine().toCharArray(),b=s.nextLine().toCharArray();
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				int m=0;
//				System.out.println("o: "+a[i]+" "+b[j]);
				if(a[i]==b[j]) {
//					System.out.println("+");
					m++;
					int p=i+1,q=j+1,ai=i,bi=j;
					while(q<b.length) {
						if(p==a.length) break;
//						System.out.println("u: "+a[p]+" "+b[q]);
						if(a[p]==b[q]) {
//							System.out.println("+");
//							System.out.print(a[p]);
							ai=p+1;
							bi=q+1;
							p++;
							m++;
						}
						q++;
					}
					if(p<a.length) {
						q=bi;
					while(p<a.length) {
						if(q==b.length) break;
//						System.out.println("n: "+a[p]+" "+b[q]);
						if(a[p]==b[q]) {
//							System.out.println("+");
//							System.out.print(a[p]);
							q++;
							m++;
						}
						p++;
					}
					}
//					System.out.println();
					max=max>m?max:m;
				}
			}
		}
		System.out.print(max);
	}

}
