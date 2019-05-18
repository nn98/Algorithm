package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//!!!
public class P10989 {
	
	static void sort(int[] arr) {
		int[] a=new int[10];
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N],count=new int[10000];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		for(int i=0;i<N;i++) count[arr[i]]++;
		int j=0;
		for(int i=0;i<N;i++) {
			if(count[j]>0) {
				System.out.println(j+1);
				count[j]--;
			}
			else j++;
		}
	}

}
