package BaekJoon._Before_Tagging;

import java.util.Scanner;
//0929 P2003
public class P2003 {
	//��Ʈ ������ ������ �Ź���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],f=0,t=0,sum=0,r=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum+=a[i];
			while(sum>m)
				sum-=a[f++];
			if(sum==m)r++;
		}
		System.out.print(r);
	}

}
