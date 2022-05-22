package Baekjoon;

import java.util.Scanner;

public class Q10871 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
        int X=s.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=s.nextInt();
            if(arr[i]<X)
                System.out.print(arr[i]+" ");
        }
	}
}
