package BaekJoon;

import java.util.Scanner;

public class P9251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] a=s.nextLine().toCharArray(),b=s.nextLine().toCharArray();
		int max=0;
		for(int i=0;i<a.length;i++) {
			int p=i,m=0,q=-1;
			for(int j=0;j<b.length;j++) {
				if(p==a.length) {
					//					p--;
					//					while(j<b.length) {
					//						if(a[p]==b[j]) {
					//							System.out.print(a[p]);
					//							m++;
					//						}
					//						j++;
					//					}
					q=j;
					break;
				}
				if(a[p]==b[j]) {
					System.out.print(a[p]);
					m++;
					p++;
				}

			}
			if(q!=-1) {
				System.out.println("!");
				while(p<a.length) {
					if(a[p]==b[q]) {
						System.out.print(a[p]);
						m++;
					}
					p++;
				}
			}
			max=max>m?max:m;
			System.out.println();
		}
		System.out.print(max);
	}

}
