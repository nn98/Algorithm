package BaekJoon;

import java.util.Scanner;
public class P1009_4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),m,i=0,k,a[][]= {
				{10},
				{1},
				{2,4,8,6},
				{3,9,7,1},
				{4,6},
				{5},
				{6},
				{7,9,3,1},
				{8,4,2,6},
				{9,1}
		};
		for(;n-->0;m=s.nextInt(),k=s.nextInt()-1,System.out.println(a[(int) (m%10)][(int) (k%a[(int) m].length)]));
	}
}