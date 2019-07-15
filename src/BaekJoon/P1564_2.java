package BaekJoon;

import java.util.Scanner;

public class P1564_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n],in=0,size=-1,sum=1;
		for(int i=2;i<=n;i++) {
			sum*=i;
			arr[i-2]=sum%100000;
			for(int j=0;j<i-2;j++) {
				if(arr[j]==arr[i-2]) size=(i-2)-j;
			}
			if(size!=-1) break;
		}
		if(size!=-1) System.out.println(arr[n%size]);
	}

}
