package BaekJoon;

import java.util.Scanner;

public class P1107_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String t=s.nextLine(),up="",down="";
		int n=s.nextInt(),r=0,ab=Math.abs(Integer.parseInt(t)-100);
		boolean arr[]=new boolean[10],u,d;
		for(int i=0;i<n;i++)arr[s.nextInt()]=true;
		for(int i=0;i<t.length();i++) {
			r++;
			if(arr[t.charAt(i)-'0']) {
				u=true;
				d=true;
				for(int j=1;j<10;j++) {
					if(d) {
						if(t.charAt(i)-'0'-j>=0) {
							if(!arr[t.charAt(i)-'0'-j]) {
								down+=t.charAt(i)-'0'-j;
								d=false;
							}
						}
					}
					if(u) {
						if(t.charAt(i)-'0'+j<arr.length) {
							if(!arr[t.charAt(i)-'0'+j]) {
								up+=t.charAt(i)-'0'+j;
								u=false;
							}
						}
					}
				}
			}
			else {
				up+=t.charAt(i)-'0';
				down+=t.charAt(i)-'0';
			}
		}
		int c1,c2;
		if(up.equals("")&&down.equals("")) {
			System.out.print(Math.abs(Integer.parseInt(t)-100));
			return;
		}
		if(up.equals("")) c1=Integer.MAX_VALUE;
		else c1=Math.abs(Integer.parseInt(t)-Integer.parseInt(up));
		if(down.equals("")) c2=Integer.MAX_VALUE;
		else c2=Math.abs(Integer.parseInt(t)-Integer.parseInt(down));
//		System.out.println(up);
//		System.out.println(down);
//		System.out.println(c1);
//		System.out.println(c2);
		r+=c1<c2?c1:c2;
		r=r<ab?r:ab;
		System.out.print(r);
	}
}