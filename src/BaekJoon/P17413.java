package BaekJoon;

import java.util.Scanner;

public class P17413 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] arr=s.nextLine().split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].charAt(0)=='<') {
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i].charAt(0)=='<') {
				boolean c=false;
				StringBuilder sb=new StringBuilder();
				System.out.println(sb.length());
				for(int k=0;k<arr[i].length();k++) {
//					System.out.println(arr[i].charAt(k));
					if(arr[i].charAt(k)=='<') {
						if(sb.length()!=0) {
							System.out.println("\n"+sb);
							System.out.print(sb.reverse());
							sb=new StringBuilder();
						}
						c=true;
					}
					if(arr[i].charAt(k)=='>') {
						System.out.print((char)arr[i].charAt(k));
						c=false;
						continue;
					}
					if(c) System.out.print((char)arr[i].charAt(k));
					else sb.append((arr[i].charAt(k)==' ')?" ":arr[i].charAt(k));
//					System.out.println(sb);
				}
			}
			else {
				for(int j=arr[i].length()-1;j>=0;j--) {
					System.out.print((char)arr[i].charAt(j));
				}
				System.out.print(" ");
			}
		}
	}

}
