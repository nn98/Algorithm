package Programmers;

import java.util.Arrays;

public class P42883 {
	public static String solution(String number, int k) {
		StringBuffer answer = new StringBuffer();
		int i=0,j=2,n=number.length()-k,a[]=new int[10];
		for(;i<number.length();a[number.charAt(i++)-'0']++);
		System.out.println(Arrays.toString(a)+n);
		for(i=0;k>0;){
			if(a[i]==0){
				i++;
			}else{
				a[i]--;
				k--;
			}
		}
		System.out.println(Arrays.toString(a)+k);
		for(i=9;n>0;){
			if(a[i]==0){
				i--;
			}else{
				a[i]--;
				answer.append(i);
				k--;
			}
		}
		return answer.toString();
	}
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}

}
