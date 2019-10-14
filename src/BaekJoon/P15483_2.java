package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P15483_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int x=a.length()+1,y=b.length()+1,r[][]=new int[x][y];
		for(int i=1;i<x;i++)r[i][0]=i;
		for(int i=1;i<y;i++)r[0][i]=i;
		for(int i=0;i<r.length;i++)System.out.println(Arrays.toString(r[i]));
	}

}
