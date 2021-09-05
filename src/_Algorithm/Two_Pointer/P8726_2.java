package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P8726_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),po=0,ko=1,dz,v=0,wy=n+1;
		s.nextLine();
		String[]a=s.nextLine().split(" ");
		dz=a[0].equals("0")?1:0;
		while(ko<n) {
			while(dz<k&po<n) {
				po++;
				if(a[po].equals("0"))dz++;
			}
			if(dz==k)wy=Math.min(wy,po-ko+1);
			if(a[ko].equals("0"))dz--;
			ko++;
		}
		System.out.print(wy==n+1?"NIE":wy-k);
	}

}
