package BaekJoon.Two_Pointer;

import java.util.Scanner;

public class P21360 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0,r=n;
		char[]a=s.next().toCharArray();
		for(;i<n;i++)if(a[i]=='.')break;
		j=i+1;
		for(;j<n;j++) {
			if(a[j]=='.') {
				r=r<j-i?r:j-i;
				i=j;
			}
		}
		System.out.print(r-1);
	}

}
