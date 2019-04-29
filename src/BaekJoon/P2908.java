package BaekJoon;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] t=s.nextLine().split(" ");
		for(int i=0;i<t.length;i++) {
			StringBuilder st=new StringBuilder(t[i]);
			st.reverse();
			t[i]=st.toString();
		}
		
		int r=Integer.parseInt(t[0])>Integer.parseInt(t[1])? Integer.parseInt(t[0]) : Integer.parseInt(t[1]);
		System.out.println(r);
	}

}
