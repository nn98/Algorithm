package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[783];
		int n=s.nextInt(),index=0;
		for(int i=2;i<6000;i++) {
			boolean is=true;
			for(int j=2;j<i;j++) if(i%j==0) is=false;
			if(is) arr[index++]=i;
		}
//		System.out.println(Arrays.toString(arr)+"\n"+index);
		for(int i=0;i<n;i++) {
			int t=s.nextInt();
			
		}
	}

}
