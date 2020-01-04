package BaekJoon;

import java.util.*;

public class P3009 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean[]a=new boolean[1001],b=new boolean[1001];
		int i=0,j,k;
		for(;i++<3;) {
			j=s.nextInt();
			if(a[j])a[j]=false;
			else a[j]=true;
			j=s.nextInt();
			if(b[j])b[j]=false;
			else b[j]=true;
		}
		for(i=0;++i<1001;)if(a[i])System.out.print(i+" ");
		for(i=0;++i<1001;)if(b[i])System.out.print(i);
	}

}
