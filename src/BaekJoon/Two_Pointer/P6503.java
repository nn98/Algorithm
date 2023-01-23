package BaekJoon.Two_Pointer;

import java.util.Scanner;

public class P6503 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j,c,a[],r;
		char t[],b,d;
//		for(char t=0;t<129;System.out.println(t+" "+(int)t++));
		while((n=s.nextInt())>0) {
			s.nextLine();
			r=c=i=j=0;
			a=new int[129];
			t=s.nextLine().toCharArray();
			for(;j<t.length;j++){
				b=t[j];
				if(a[b]==0)c++;
				a[b]++;
				if(c>n) {
					for(;c>n;i++) {
						d=t[i];
						a[d]--;
						if(a[d]==0)c--;
					}
				}
				r=r>j-i+1?r:j-i+1;
			}
			System.out.println(r);
		}
	}

}
