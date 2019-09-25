package BaekJoon;

import java.util.Scanner;

public class P17363 {

	static String sol(String t) {
		switch(t) {
		case ".":
			return t;
		case "O":
			return t;
		case "-":
			return "|";
		case "|":
			return "-";
		case "/":
			return "\\";
		case "\\":
			return "/";
		case "^":
			return "<";
		case "<":
			return "v";
		case "v":
			return ">";
		case ">":
			return "^";
		default:
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		s.nextLine();
		String[][] arr=new String[a][b],brr=new String[b][a];
		for(int i=0;i<a;i++) {
			String[] in=s.nextLine().split("");
//			System.out.println(Arrays.toString(in));
			arr[i]=in;
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				brr[j][i]=sol(arr[i][j]);
			}
		}
		for(int i=b-1;i>=0;i--) {
			for(int j=0;j<a;j++) {
				System.out.print(brr[i][j]);
			}
			System.out.println();
		}
	}
}