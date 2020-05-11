package BaekJoon;

import java.util.Scanner;

public class P1011_2 {

	static int n,i,a,b,j;
	
	static void o(int f, int t){
		i=1;
		a=f;
		b=t;
		j=0;
		if(t-f==1)System.out.println(1);
		else {
			for(;;) {
				a+=i;
				j++;
				if(a>=b)break;
				b-=i;
				j++;
				if(a>=b)break;
				i++;
			}
			System.out.println(j);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(n=s.nextInt();n-->0;o(s.nextInt(),s.nextInt()));
	}

}
