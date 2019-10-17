package BaekJoon;

import java.util.Scanner;

public class P1051 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),o=n<m?n:m,r=0;
		s.nextLine();
		String[]a=new String[n];
		for(int i=0;i<n;i++)a[i]=s.nextLine();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				char t=a[i].charAt(j);
//				System.out.println(t);
				for(int k=1;k+i<n&&k+j<m;k++) {
					if(a[i].charAt(j+k)==t&&a[i+k].charAt(j)==t&&a[i+k].charAt(j+k)==t) {
//						System.out.println(t);
						r=r>k?r:k;
					}
				}
			}
		}
        if(r!=0)r++;
		System.out.print(r*r);
	}

}