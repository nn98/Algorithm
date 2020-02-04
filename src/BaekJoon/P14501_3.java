package BaekJoon;

import java.util.Scanner;

//https://mygumi.tistory.com/151
public class P14501_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,r=0;
		int[]a=new int[n+1],b=new int[n+1],h=new int[n+1];
		for(;i++<n;a[i]=s.nextInt(),b[i]=s.nextInt(),h[i]=b[i]);
		for(i=1;i++<n;)
			for(j=0;++j<i;)
				if(a[j]>i-j)
					h[i]=Math.max(b[i]+h[j],h[i]);
		for(i=0;i++<n;)
			if(n+1<i+a[i])
				r=r>h[i]?r:h[i];
				System.out.print(r);
	}

}
