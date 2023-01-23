package BaekJoon._Before_Tagging;

import java.util.*;

public class P2312_S {
	//ü�� �Ÿ��� ���� �����ϰ� �Ҽ� ã��. �ᱹ �������� �� �Ҽ��� ����ϱ�
	//�ð� �Ȱ���?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k,n,a,i;
		for(k=sc.nextInt();k>0;k--) {
			n=sc.nextInt();
			i=2;
			while(n!=1){
				a=0;
				for(;;){
					if(n%i==0){
						a++;
						n/=i;
					}else break;
				}
				if(a!=0)System.out.println(i + " " + a);
				i++;
			}
		}
	}
}