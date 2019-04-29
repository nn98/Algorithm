package BaekJoon;

import java.util.Scanner;

public class P5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] t=s.next().toCharArray();
		int sum=0;
		//int[] arr= {2,5,8,11,14,18,21,25};
		int[] arr= {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		for(char i:t) {
			int c=(i-'A');
			System.out.println("index:"+c+"val: "+arr[c]);
			sum+=arr[c];
		}
		System.out.println(sum);
	}

}
