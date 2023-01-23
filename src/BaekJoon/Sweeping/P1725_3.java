package BaekJoon.Sweeping;

import java.util.Scanner;
import java.util.Stack;

public class P1725_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],m=0,j;
		Stack<Integer>k=new Stack();
		for(;i<n;i++) {
			a[i]=s.nextInt();
			while(!k.isEmpty()&&a[k.peek()]>a[i]) {
				System.out.println("stack is not empty, ���� ž �ε����� ���� �Է¹��� ������ ũ��");
				System.out.println("��, �̹� ���밡 �� �� ���뺸�� �۴�");
				j=k.pop();
//				System.out.println("j-top of stack: "+j);
				System.out.println("���� ���� ž �ε��� ��, "+j);
				long w=i;
				System.out.println("���� w�� ���� ž�� �ε����� i, "+w);
				if(!k.isEmpty()) {
					w-=k.peek()+1;
					System.out.println("���ÿ� ���� ���� ������ ���� - (ž �ε���+1), "+w);
				}
				long c=a[j]*w;
				System.out.println("���� ���簢���� ũ��� ó���� ���� �ε����� ��(������ ����) * ���� ���� "+c);
				m=(int) (m<c?c:m);
			}
			k.push(i);
		}
		while(!k.isEmpty()) {
			System.out.println("���ÿ� �� ����");
			j=k.pop();
			System.out.println("���� ž �ε���, "+j);
			long w=i;
			if(!k.isEmpty())w-=k.peek()+1;
			System.out.println("��ĭ���� ���ؼ�, "+w);
			long c=a[j]*w;
			System.out.println("���� ���, "+a[j]+" * "+w+" = "+c);
			m=(int) (m<c?c:m);
		}
		System.out.println(m);
		System.out.println("�̰� �����س��°� ��ģ���ΰ� �ƴϳ� �ù�");
	}

}