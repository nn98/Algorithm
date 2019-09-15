package BaekJoon;

import java.util.Scanner;

public class P2448_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),c=6,in=3;
		String[] arr=new String[n];
		arr[0]="  *  ";
		arr[1]=" * * ";
		arr[2]="*****";
		while(c<=n) {
			arr[in]="";
			for(int j=0;j<2;j++) {
				if(j==0)
					arr[in]+=arr[in-(c/2)]+" ";
				else 
					arr[in]+=arr[in-(c/2)];
			}
			in++;
			if(in==c) {
				String a="   ";
				for(int i=0;i<c/2;i++) {
					arr[i]=a+arr[i]+a;
				}
				c*=2;
			}
		}
//		for(int i=3;i<n;i++) {
//			arr[i]="";
//			if(i<6)
//				for(int j=0;j<=i/3;j++) arr[i]+=arr[i-3]+" ";
//			else if()
//		}
		for(int i=1;i<=n;i++) {
			if(i<=n/2) System.out.print("   ");
			System.out.println(arr[i-1]);
		}
	}

}
