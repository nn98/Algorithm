package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SerchAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("find:");
		int[] arr=new int[10];
		for(int i=1;i<=arr.length;i++) {
			arr[i-1]=i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("find:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("index: "+find(arr,n));

	}
	public static int find(int[] arr,int n) {
		int f=0;
		int t=arr.length-1;
		int m=(f+t)/2;
		while(f<t) {
			if(arr[m]==n) return m;
			else if(arr[m]>n) {
				t=m;
				m=(f+t)/2;
			}
			else if(arr[m]<n)  {
				f=m;
				m=(f+t)/2;
			}
		}
		return -1;
	}

}