package BaekJoon.DP;

//https://krockseed.tistory.com/1

import java.util.Scanner;

public class P19622 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		long a[][]=new long[n+2][3],d[][]=new long[1000001][2];
//		a ���̸� n+1���ϸ� �ε��� ����
//		??
		
//		for(;i++<n;a[i][0]=s.nextInt(),a[i][1]=s.nextInt(),a[i][2]=s.nextInt());
//		ȸ�� ����/�� �ð��� �ʿ䵵 ���� ����ġ��
		for(;i++<n;s.next(),s.next(),a[i][2]=s.nextInt());
		
		d[1][1]=a[1][2];
		d[2][1]=a[2][2];
		d[2][0]=a[1][2];
//		dp �迭 
		for(i=0;i++<n;d[i][0]=Math.max(d[i-1][0],d[i-1][1]),d[i][1]=d[i-1][0]+a[i][2]);
		
//		�̹� ȸ�ǿ� �������� �ʾҴٸ�, �� ȸ�ǿ� ������ �Ͱ�, �������� ���� ���� �ִ��� ��������,
//
//		�̹� ȸ�ǿ� �����ߴٸ�, �� ȸ�ǿ��� �������� ���ϴ� d[i-1][0] �� ���� ���� �����ش�.
		System.out.println(Math.max(d[n][0],d[n][1]));
	}

}
