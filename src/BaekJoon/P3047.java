package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P3047 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,a[]=new int[3],b[]=new int[3],x=0,y=0;
		for(;i<3;i++){
			a[i]=s.nextInt();
			x=a[x]>a[i]?x:i;
			y=a[y]<a[i]?y:i;
		}
		b[0]=a[y];
		b[2]=a[x];
		b[1]=a[3-x-y];
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		s.nextLine();
		for(char t:s.nextLine().toCharArray())
			System.out.print(b[t-'A']+" ");
	}

}
