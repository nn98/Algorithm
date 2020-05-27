package _Algorithm.Sorting;
//아 선행조건이 중복이네ㅎ
import java.util.Arrays;
import java.util.Scanner;

public class P1516 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][2],i=0,j;
		for(;i<n;) {
			for(j=0;j<2;a[i][j++]=s.nextInt());
			if(++i>1)s.next();
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
