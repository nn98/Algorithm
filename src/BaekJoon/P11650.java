package BaekJoon;

import java.util.Scanner;

public class P11650 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		boolean arr[][]=new boolean[200001][200001];
		for(int i=0;i<n;i++) {
			String in=s.nextLine(),ip[]=in.split(" ");
			arr[Integer.parseInt(ip[0]+100000)][Integer.parseInt(ip[1]+100000)]=true;
		}
		for(int i=0;i<arr.length;i++) 
			for(int j=0;j<arr[i].length;j++) 
				if(arr[i][j]) System.out.println(i-100000+" "+(j-100000));
	}
}
