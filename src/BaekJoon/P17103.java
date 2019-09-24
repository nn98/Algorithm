package BaekJoon;

import java.util.Scanner;

public class P17103 {

	public static void main(String[] args) {
		boolean[] arr=new boolean[1000000];
		for(int i=2;i<arr.length;i++) {
			if(!arr[i]) {
				for(int j=i+i;j<arr.length;j+=i) arr[j]=true;
			}
		}
		Scanner s=new Scanner(System.in);
		for(int i=s.nextInt();i>0;i--) {
			int t=s.nextInt(),r=0;
			for(int j=2;j<=t/2;j++) {
				if(!arr[j]) {
					if(!arr[t-j]) r++;
				}
			}
			System.out.println(r);
		}
	}

}
