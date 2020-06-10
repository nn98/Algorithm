package _Algorithm.Sweeping;

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
				System.out.println("stack is not empty, 스택 탑 인덱스의 값이 입력받은 값보다 크다");
				System.out.println("즉, 이번 막대가 이 전 막대보다 작다");
				j=k.pop();
//				System.out.println("j-top of stack: "+j);
				System.out.println("현재 스택 탑 인덱스 팝, "+j);
				long w=i;
				System.out.println("넓이 w는 현재 탑의 인덱스인 i, "+w);
				if(!k.isEmpty()) {
					w-=k.peek()+1;
					System.out.println("스택에 값이 남아 있으면 넓이 - (탑 인덱스+1), "+w);
				}
				long c=a[j]*w;
				System.out.println("최종 직사각형의 크기는 처음에 팝한 인덱스의 값(막대의 높이) * 구한 넓이 "+c);
				m=(int) (m<c?c:m);
			}
			k.push(i);
		}
		while(!k.isEmpty()) {
			System.out.println("스택에 값 남음");
			j=k.pop();
			System.out.println("남은 탑 인덱스, "+j);
			long w=i;
			if(!k.isEmpty())w-=k.peek()+1;
			System.out.println("몇칸인지 구해서, "+w);
			long c=a[j]*w;
			System.out.println("넓이 계산, "+a[j]+" * "+w+" = "+c);
			m=(int) (m<c?c:m);
		}
		System.out.println(m);
		System.out.println("이걸 생각해내는게 미친놈인거 아니냐 시발");
	}

}