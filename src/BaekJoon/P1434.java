package BaekJoon;

import java.util.Scanner;

public class P1434 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,a[]= {s.nextInt(),s.nextInt(),s.nextInt()};
		while(i<n) {
			j=s.nextInt();
			for(;;)
				if(a[i]>=j) {
					a[i]-=j;
					break;
				}else i++;
		}
		j=0;
		for(i=0;i<n;j+=a[i++]);
		System.out.print(j);
	}

}
