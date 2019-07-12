package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1911_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),L=s.nextInt(),arr[]=new int[N*2],t=0,r=0;
		for(int i=0;i<N;i++) {
			int a=s.nextInt(),b=s.nextInt();
			arr[i*2]=a;
			arr[i*2+1]=b;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr[i];j<arr[i+1];j++) t++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(t);
		r=t/L+(t%L==0?0:1);
		System.out.println(r);
	}

}
