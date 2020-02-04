package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14719 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),i=0,j;
		boolean[][]a=new boolean[x][y];
		for(;i<y;i++)for(j=s.nextInt();j-->1;a[i][j]=true);
		for(boolean[]b:a)System.out.println(Arrays.toString(b));
	}

}
