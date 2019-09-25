package BaekJoon;

import java.util.Scanner;

public class P2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<20;i++) {
			if(i<4) arr[0]+=s.nextInt();
			else if(i<8) arr[1]+=s.nextInt();
			else if(i<12) arr[2]+=s.nextInt();
			else if(i<16) arr[3]+=s.nextInt();
			else if(i<20) arr[4]+=s.nextInt();
		}
		int mI=0,max=arr[0];
		for(int i=1;i<5;i++) {
			if(arr[mI]<arr[i]) {
				mI=i;
				max=arr[i];
			}
		}
		System.out.print((mI+1)+" "+max);
	}
}