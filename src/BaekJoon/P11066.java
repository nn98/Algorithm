package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11066 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[],m,sum;
		for(int i=0;i<n;i++) {
			a=new int[10000000];
			m=s.nextInt();
			sum=0;
//			int[]t=new int[m];
			for(int j=0;j<m;j++) {
//				t[j]=s.nextInt();
				a[s.nextInt()]++;
//				a[t[j]]++;
			}
//			Arrays.sort(t);
//			System.out.println(Arrays.toString(t));
			while(m>1) {
				int x=0,y=0;
				for(int k=0;k<10001;k++) {
					if(x!=0&&y!=0)break;
					if(a[k]!=0) {
						a[k]--;
						if(x==0)x=k;
						else y=k;
						k--;
					}
				}
				if(x!=0)m--;
				if(y!=0)m--;
				sum+=x+y;
//				System.out.println(x+" "+y+" "+sum);
				a[x+y]++;
				m++;
			}
			System.out.println(sum);
		}
	}

}
