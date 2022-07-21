package Programmers.String;

import java.util.Scanner;

//문자열 압축
//https://school.programmers.co.kr/learn/courses/30/lessons/60057?language=java
public class P60057 {
	static public int solution(String s) {
        String c="",n;
        int a=s.length(),i=0,j,b;
        for(;i++<s.length()/2;){
            b=1;
            c=s.substring(0,i);
            StringBuffer r=new StringBuffer();
            for(j=i;j<=s.length();j+=i){
                n=s.substring(j,j+i>s.length()?s.length():i+j);
                if(c.equals(n))b++;
                else{
                    r.append((b<2?"":b)+c);
                    c=n;
                    b=1;
                }
            }
            r.append(c);
            System.out.println(r);
            a=Math.min(a,r.length());
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(solution(s.next()));
	}

}
