package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1107 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String t=s.nextLine(),re="";
		int n=s.nextInt(),r=0,ab;
		boolean arr[]=new boolean[10];
		for(int i=0;i<n;i++) {
			arr[s.nextInt()]=true;
		}
		for(int i=0;i<t.length();i++) {
			r++;
			if(arr[t.charAt(i)-'0']) {
				for(int j=1;j<10;j++) {
					if(t.charAt(i)-'0'-j>=0) {
						if(!arr[t.charAt(i)-'0'-j]) {
							re+=t.charAt(i)-'0'-j;
							break;
						}
					}
					if(t.charAt(i)-'0'+j<arr.length) {
						if(!arr[t.charAt(i)-'0'+j]) {
							re+=t.charAt(i)-'0'+j;
							break;
						}
					}
				}
			}
			else {
				re+=t.charAt(i)-'0';
			}
		}
		System.out.println(re+" "+r);
		if(re.equals("")) {
			System.out.print(Math.abs(Integer.parseInt(t)-100));
			return;
		}
//		for(int i=0;i<t.length();i++) {
//			r+=Math.abs(t.charAt(i)-re.charAt(i));
//		}
		r+=Math.abs(Integer.parseInt(t)-Integer.parseInt(re));
		ab=Math.abs(Integer.parseInt(t)-100);
		r=r<ab?r:ab;
		System.out.print(r);
	}
}