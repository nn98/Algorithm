package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P11945_S {
	//hasNext ������ ���α׷����� �ȵ����µ�
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.next();
		while(s.hasNext()) {
			System.out.println(new StringBuffer(s.next()).reverse());
		}
	}

}
