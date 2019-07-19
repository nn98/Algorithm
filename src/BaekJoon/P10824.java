package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P10824 {
	//8min - BigInteger
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++) arr[i]=s.nextInt();
		String a1=""+arr[0]+arr[1],a2=""+arr[2]+arr[3];
		BigInteger b=new BigInteger(a1).add(new BigInteger(a2));
		System.out.println(b);
	}
}
