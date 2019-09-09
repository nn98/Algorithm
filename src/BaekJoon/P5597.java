package BaekJoon;

import java.util.Scanner;

public class P5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[31];
		for(int i=0;i<28;i++) arr[s.nextInt()]=1;
		for(int i=1;i<31;i++) if(arr[i]==0) System.out.println(i);
	}

}
