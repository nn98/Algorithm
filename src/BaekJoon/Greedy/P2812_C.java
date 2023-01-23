package BaekJoon.Greedy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P2812_C {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0;
		Deque<Character>d=new LinkedList();
		char[]a=s.next().toCharArray();
		for(;i<n;) {
			while(!d.isEmpty())
				if(d.peekLast()<a[i]&k>0) {
					d.pollLast();
					k--;
				}else break;
			d.add(a[i++]);
			System.out.println(d);
		}
		for(n=d.size()-k;n-->0;)
			System.out.print(d.poll());
	}
}
/*
IT �л�ȸ�� Ȳ�����Դϴ� 
	https://everytime.kr/378833/v/126526948
	
IT �л��ӿ����б� ����(���幮,���ٿ��o)
	https://everytime.kr/378833/v/126684171
	
[�ܵ�] IT �ӿ� ���б��� ȸ����� '����' �ߴٰ��?
	https://everytime.kr/378833/v/126774862(���)
	
�̾ߤ��� ���̰� ����
	https://everytime.kr/378833/v/126853254
*/