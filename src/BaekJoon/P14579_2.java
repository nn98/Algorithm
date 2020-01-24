package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14579_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=1001,a[]=new int[i],j=1;
		for(;j<i;a[j]=j+a[j-1],j++);
		System.out.println(Arrays.toString(a));
	}

}
