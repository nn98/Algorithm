package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P6591 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		while(a!=0&&b!=0) {
			int size=a-(a-b),arr[]=new int[size],r=1,brr[]=new int[b-1],e=1;
			for(int i=0;i<size;i++) {
				arr[i]=a-i;
			}
			for(int i=0;i<b-1;i++) {
				brr[i]=b-i;
			}
			for(int i=0;i<b-1;i++) {
				for(int j=0;j<size;j++) {
					if(arr[j]%brr[i]==0) {
						arr[j]/=brr[i];
						brr[i]=1;
						break;
					}
				}
//				e*=brr[i];
			}
//			System.out.println(Arrays.toString(arr));
//			System.out.println(Arrays.toString(brr));
//			System.out.println(e);
			for(int i:arr) r*=i;//
			for(int i:brr) r/=i;
			System.out.println(r);
			a=s.nextInt();
			b=s.nextInt();
		}
	}
}
