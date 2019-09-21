package BaekJoon;

import java.util.*;

public class P2312_S {
	//체로 거를거 없이 심플하게 소수 찾기. 결국 나머지는 다 소수의 배수니까
	//시간 똑같네?
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