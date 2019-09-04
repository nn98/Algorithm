package BaekJoon;

import java.util.Scanner;

public class P2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0,arr[]=new int[7];
		for(int i=1;i<4;i++) arr[s.nextInt()]++;
		for(int i=1;i<7;i++) {
			if(arr[i]==3) {
				sum=10000+i*1000;
				break;
			} else if(arr[i]==2) {
				sum=1000+i*100;
				break;
			} else if(arr[i]==1) sum=i*100;
		}
		System.out.println(sum);
	}

}
