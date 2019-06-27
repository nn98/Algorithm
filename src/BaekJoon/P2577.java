package BaekJoon;

import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		int r=1;
		for(int i=0;i<3;i++) r*=s.nextInt();
		String[] re=Integer.toString(r).split("");
		for(int i=0;i<re.length;i++) arr[Integer.parseInt(re[i])]++;
		
		for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		
	}

}
