package Programmers;

import java.util.Arrays;

public class P42626 {
	static int solution(int[] s, int K) {
        int a = 0,i=0,c=0,l=s.length;
        try {
            for(;c<l;) {
            	for(;i<l;i++)if(s[i]<K) {
            		s[i+1]=s[i]+s[i+1]*2;
            		s[i]=-1;
            		a++;
            		Arrays.sort(s);
            	}
            	for(i=0,c=0;i<l;c+=s[i]<0|s[i]>=K?1:0,i++);
//            	System.out.println(c);
            	i=0;
            }
        }catch(Exception e) {
        	return -1;
        }
        return a;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,9,10,12},7));
	}

}
