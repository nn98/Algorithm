package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {
	static Scanner s=new Scanner(System.in);
	public static void main(String args[]) {
		int N=s.nextInt();
        float[] arr=new float[N];
        for(int i=0;i<N;i++) 
            arr[i]=s.nextFloat();
        Arrays.sort(arr);
        float sum=0;
        for(int i=0;i<N;i++) {
            arr[i]=(arr[i]/arr[N-1])*100;
            sum+=arr[i];
        }
        System.out.print(sum/N);
	}
}
