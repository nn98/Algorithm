package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] now=s.nextLine().split(":"),from=s.nextLine().split(":");
		int[] n=new int[3],f=new int[3],r=new int[3];
		boolean ac=true;
		for(int i=0;i<3;i++) {
			n[i]=Integer.parseInt(now[i]);
			f[i]=Integer.parseInt(from[i]);
		}
		for(int i=2;i>=0;i--) {
			if(n[i]>f[i]) ac=false;
			else ac=true;
		}
//		System.out.println(ac);
		if(ac) {
			if(f[2]<n[2]) {
				r[2]=60-n[2]+f[2];
				f[1]--;
				if(f[1]<n[1]) {
					r[1]=60-n[1]+f[1];
					f[0]--;
				}
				else {
					r[1]=f[1]-n[1];
				}
				r[0]=f[0]-n[0];
			}
			else {
				r[2]=f[2]-n[2];
				if(f[1]<n[1]) {
					r[1]=60-n[1]+f[1];
					f[0]--;
				}
				else {
					r[1]=f[1]-n[1];
				}
				r[0]=f[0]-n[0];
			}
			for(int i=0;i<2;i++) {
				if(r[i]<10) System.out.print("0"+r[i]+":");
				else System.out.print(r[i]+":");
			}
			if(r[2]<10) System.out.print("0"+r[2]);
			else System.out.print(r[2]);
		}
		else {
			f[0]+=24;
			if(f[2]<n[2]) {
				r[2]=60-n[2]+f[2];
				f[1]--;
				if(f[1]<n[1]) {
					r[1]=60-n[1]+f[1];
					f[0]--;
				}
				else {
					r[1]=f[1]-n[1];
				}
				r[0]=f[0]-n[0];
			}
			else {
				r[2]=f[2]-n[2];
				if(f[1]<n[1]) {
					r[1]=60-n[1]+f[1];
					f[0]--;
				}
				else {
					r[1]=f[1]-n[1];
				}
				r[0]=f[0]-n[0];
			}
			for(int i=0;i<2;i++) {
				if(r[i]<10) System.out.print("0"+r[i]+":");
				else System.out.print(r[i]+":");
			}
			if(r[2]<10) System.out.print("0"+r[2]);
			else System.out.print(r[2]);
		}
	}
}
