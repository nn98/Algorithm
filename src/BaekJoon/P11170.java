package BaekJoon;

import java.util.Scanner;

public class P11170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int f=s.nextInt(),t=s.nextInt(),r=0;
			for(int j=f;j<=t;j++) {
				String k=""+j;
				while(!(k.replace("0", "").equals(k))) {
//					System.out.println(k);
					k=k.replaceFirst("0", "");
					r++;
				}
			}
			System.out.println(r);
		}
	}
}
