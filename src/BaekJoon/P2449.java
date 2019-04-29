package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2449 {
	static int count=0;
	static int sol(int[] arr, int index, int value) {
		count++;
		System.out.println(count+Arrays.toString(arr));
		int sVal=arr[index];
		arr[index]=value;
		if(index==0||index==arr.length-1) arr[index]=value;
		if(arr[index-1]==sVal) sol(arr,index-1,value);
		else return arr[index-1];
		if(arr[index+1]==sVal) sol(arr,index+1,value);
		else return arr[index+1];
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),C=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		int sVal=arr[arr.length/2];
		for(int i=0;i<C;i++) {
			if(i==0) sVal=sol(arr,arr.length/2,0);
			else sVal=sol(arr,arr.length/2,sVal);
		}
	}

}
