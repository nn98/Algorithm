package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[]=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		int[] brr=arr.clone(),his=new int[N];
		Arrays.sort(brr);
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i]==brr[j]) {
					while(!(his[j]==0)) j++;
					System.out.print(j+" ");
					his[j]=1;
					break;
				}
			}
		}
		//		int index=0;
		//		for(int i=0;i<N;i++) {
		//			int t=index;
		//			for(int j=index;j<N;j++) {
		//				if(arr[j]<=arr[t]) t=j;
		//			}
		//			brr[t]=index++;
		//		}
	}

}
