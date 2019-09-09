package Algorithm_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P6_2 {

	static List<String> arr=new ArrayList<String>();
	static int N;
	
	static String sol(int o,int c) {
		String r="";
		while(true) {
			if(o==0&&c==0) break;
			if(o>0&&c!=0) r+=("("+sol(o-1,c));
			if(c>0&&o!=0) r+=(")"+sol(o,c-1));
		}
		return r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		System.out.println(sol(N,N));
		System.out.println(arr.toString());
	}

}
