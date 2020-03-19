package BaekJoon;

import java.util.Scanner;

//1
//2 4 8 6 2
//3 9 7 1 3
//4 6 4
//5
//6
//7 9 3 1 7
//8 4 2 6 8
//9 1
public class P1009_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),m,i=0,k,a[][]= {
				{1},
				{2,4,8,6},
				{3,9,7,1},
				{4,6},
				{5},
				{6},
				{7,9,3,1},
				{8,4,2,6},
				{9,1},
				{0}
		};
		for(;n-->0;m=s.nextInt()-1,k=s.nextInt()-1,System.out.println(a[(int) (m%10)][(int) (k%a[(int) m].length)]));
	}
}
