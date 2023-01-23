package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P1049_2 {
	//� ��ģ������ ��Ÿ���� 100������ �� �Ƕ��̰��� ��
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=9000;
		for(int m=s.nextInt();m>0;m--) {
			int t=s.nextInt();
			r=r<t?r:t;
			t=s.nextInt()*n;
			r=r<t?r:t;
		}
		System.out.print(r);
	}

}
