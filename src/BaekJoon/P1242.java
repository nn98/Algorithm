package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),m=s.nextInt(),count=0,sum=0;
		boolean[] arr=new boolean[n];
		for(int i=1;sum!=n;i++) {
			if(i==n) i=1;
			if(arr[i-1]) {
				continue;
			}
			if(i==k) {
				arr[i-1]=true;
				sum++;
			}
			if(arr[m-1]) {
				System.out.println(count);
				return;
			}
			count++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}
