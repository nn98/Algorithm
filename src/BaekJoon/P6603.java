package BaekJoon;

import java.util.Scanner;

public class P6603 {

	static int k,a[],i;
	static void o(int x,String s) {
		if(x==k)
			if(s.split(" ").length==6)
				System.out.println(s);
			else
				return;
		else {
			o(x+1,s+a[x]+" ");
			o(x+1,""+s);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while((k=s.nextInt())!=0) {
			a=new int[k];
			for(i=0;i<k;i++)a[i]=s.nextInt();
			o(0,"");
			System.out.println();
		}
	}
}