package BaekJoon;

import java.util.Scanner;

public class P1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n],max=0,add=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			if(arr[i]<0) {
				max=max>add?max:add;
				add=0;
			} else {
				add+=arr[i];
			}
		}
		System.out.println(max);
	}

}
