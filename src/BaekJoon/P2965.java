package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2965 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,a[]=new int[3],v;
		for(;i<3;a[i++]=s.nextInt());
		Arrays.sort(a);
		v=a[1]=a[0];
		v=v>a[2]-a[1]?v:a[2]-a[1];
		System.out.println(v);
	}
}