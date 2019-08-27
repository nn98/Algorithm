package BaekJoon;

import java.util.Scanner;

public class P11104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String in=s.nextLine();
			int j=0,c=0;
			for(;in.charAt(j)=='0';j++);
			in=in.substring(j);
//			System.out.println(in);
			j=0;
			for(int q=in.length()-1;q>=0;q--) {
//				System.out.println(in.charAt(q));
				if(in.charAt(q)=='1') j+=Math.pow(2, c);
				c++;
			}
			System.out.println(j);
		}
	}

}
