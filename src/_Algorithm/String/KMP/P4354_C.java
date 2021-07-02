package _Algorithm.String.KMP;
/*
머리로만 이해
접미사 배열
https://jaimemin.tistory.com/630

접두사/접미사인 부분문자열 길이 저장- pi
at index length-1, 접두/접미인 부분문자열
length-1일때 해당 부분문자열의 길이 빼고 n제곱하면 length 나와야
= length/(length-pi[length-1])
*/

import java.util.*;
public class P4354_C {
	static char[]c;
	static int p[],i,j,l;
//	부분 일치를 통해 pi 계산
//	pi[i]=문자열 해당 인덱스까지의 접미/접두사인 문자열 최대 길이 
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
//			같은동안 tail++ 
			if(c[i+j]==c[j]) {
				j++;
//				pi배열 에 현재인덱스에 tail+1
				p[i+j-1]=j;
			}else {
				if(j==0)i++;
				else {
					i+=j-p[j-1];
					j=p[j-1];
				}
			}
			System.out.println(Arrays.toString(p)+" begin: "+j+" matched: "+i);
		}
	}
	public static void main(String[]x){
		Scanner s=new Scanner(System.in);
		String z;
		while(!(z=s.next()).equals(".")) {
			c=z.toCharArray();
			o();
//			부분문자열이 없거나 마지막 나눴을때 나누어 떨어지지 않으면 1 
			/*수포자를 살*/
			System.out.println(p[l-1]==0|p[l-1]%(l-p[l-1])>0?
					1:l/(l-p[l-1]));
		}
	}

}