package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P5026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String in=s.nextLine();
			if(in.substring(1,2).equals("=")) {
				System.out.println("skipped");
			}
			else {
//				System.out.println(in);
//				System.out.println(Arrays.toString(in.split("\\+")));
				String[] arr=in.split("\\+");
				System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			}
		}
	}

}
