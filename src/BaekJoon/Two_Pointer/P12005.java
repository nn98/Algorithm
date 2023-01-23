package BaekJoon.Two_Pointer;

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
//			�ѹ��� �ݺ��ż� ���� ���� �ߺ��̸� ��Ȯ�� ���� �ƴ�.
//			���� 1���ϰ� 1���ϱ� ����� �������� ���õ�
			r=r>i-j+1?r:i-j+1;
		}
		System.out.print(r);
	}

}
