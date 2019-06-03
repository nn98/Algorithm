package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P17252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[20];
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)Math.pow(3, i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
