package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P12005 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],i=0,r=0,j=0;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.sort(a);
		for(i=0;i<n;i++) {
			if(a[i]-a[j]>k)j++;
//			한번만 반복돼서 앞쪽 값이 중복이면 정확한 값음 아님.
//			차피 1더하고 1빼니까 결과는 문제없이 나올듯
			r=r>i-j+1?r:i-j+1;
		}
		System.out.print(r);
	}

}
