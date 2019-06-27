package BaekJoon;

import java.util.Scanner;

public class P10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=5;
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
			if(arr[i]<40) arr[i]=40;
		}
		int sum=0;
		for(int i=0;i<N;i++) sum+=arr[i];
		System.out.println(sum/N);
	}
}
