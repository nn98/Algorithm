package BaekJoon.String.KMP;
/*
�Ӹ��θ� ����
���̻� �迭
https://jaimemin.tistory.com/630
���λ�/���̻��� �κй��ڿ� ���� ����- pi
at index length-1, ����/������ �κй��ڿ�
length-1�϶� �ش� �κй��ڿ��� ���� ���� n�����ϸ� length ���;�
= length/(length-pi[length-1])
*/
import java.util.*;
public class P4354_C {
	static char[]c;
	static int p[],i,j,l;
//	�κ� ��ġ�� ���� pi ���
//	pi[i]=���ڿ� �ش� �ε��������� ����/���λ��� ���ڿ� �ִ� ���� 
	static void o() {
		l=c.length;
		p=new int[l];
//		tail
		i=1;
//		head
		j=0;
		while(i+j<l) {
			System.out.print(c);
			System.out.println(" begin: "+j+" matched: "+i);
//			�������� tail++ 
			if(c[i+j]==c[j]) {
				j++;
//				pi�迭 �� �����ε����� tail+1
				p[i+j-1]=j;
			}else {
				if(j==0)i++;
				else {
					i+=j-p[j-1];
					j=p[j-1];
				}
			}
//			���ڿ� �����̴� ����Ǻ��� p[l-1]��
			System.out.println(Arrays.toString(p)+" begin: "+j+" matched: "+i);
		}
	}
	public static void main(String[]x){
		Scanner s=new Scanner(System.in);
		String z;
		while(!(z=s.next()).equals(".")) {
			c=z.toCharArray();
			o();
//			�κй��ڿ��� ���ų� ������ �������� ������ �������� ������ 1 
			System.out.println(p[l-1]==0|p[l-1]%(l-p[l-1])>0?1:l/(l-p[l-1]));
		}
	}
}