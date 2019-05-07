package BaekJoon;

//import java.util.Arrays;
import java.util.Scanner;

public class P2751 {

	static void solv(int[] arr,int f,int t) {
		if(t==f) return;
		else {
			//System.out.println("sol +");
			int m=(f+t)/2;
			solv(arr,f,m);
			solv(arr,m+1,t);
			merge(arr,f,m,t);
		}

	}

	static void merge(int[] arr,int f,int m,int t) {
		int length=t-f+1;
		int[] arr1=new int[length];
		int i=0;
		int i1=f;
		int i2=m+1;

		while(i1<=m && i2<=t) arr1[i++]=arr[i1]<arr[i2]?arr[i1++]:arr[i2++];
		while(i1<=m) arr1[i++]=arr[i1++];
		while(i2<=t) arr1[i++]=arr[i2++];
		
		for(i=0;i<length;i++)
			arr[f+i]=arr1[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		//System.out.println(Arrays.toString(arr));
		solv(arr,0,arr.length-1);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<N;i++) System.out.println(arr[i]);
	}

}
