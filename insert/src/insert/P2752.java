package insert;

import java.util.Arrays;
import java.util.Scanner;

public class P2752 {
	
	static void sol(int[] arr,int i,int j) {
		if(arr[i]>arr[j]) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		arr[2]=s.nextInt();
		int in=s.nextInt();
		if(in>arr[2]) arr[3]=in;
		else arr[1]=in;
		in=s.nextInt();
		if(in>arr[2]) arr[4]=in;
		else arr[0]=in;
		sol(arr,0,1);
		sol(arr,3,4);
		for(int i:arr) if(i!=0) System.out.print(i+" ");
	}
}