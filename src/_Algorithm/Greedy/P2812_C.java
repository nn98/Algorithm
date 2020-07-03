package _Algorithm.Greedy;

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
IT 학생회장 황해인입니다 
	https://everytime.kr/378833/v/126526948
	
IT 학생임원장학금 관련(초장문,세줄요약o)
	https://everytime.kr/378833/v/126684171
	
[단독] IT 임원 장학금을 회장단이 '낼름' 했다고요?
	https://everytime.kr/378833/v/126774862(당근)
	
이야ㅋㅋ 어이가 없네
	https://everytime.kr/378833/v/126853254
*/