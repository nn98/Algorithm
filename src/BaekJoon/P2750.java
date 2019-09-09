package BaekJoon;

//import java.util.Arrays;
import java.util.Scanner;

public class P2750 {
	static void swap(int[] arr,int i,int j) {
		int v=arr[i];
		arr[i]=arr[j];
		arr[j]=v;
	}
	static void solv(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) swap(arr,j,j+1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		//System.out.println(Arrays.toString(arr));
		solv(arr);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<N;i++) System.out.println(arr[i]);
	}

}
