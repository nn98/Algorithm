package Programmers;

import java.util.Arrays;

public class P118667 {
	static public int solution(int[] q, int[] p) {
        int l=q.length,a[]=new int[l*2],i=0,x=0,y=l,r=0,A=0,B=0;
        for(;i<l*2;a[i]=i<l?q[i]:p[i%l],A+=i<l?a[i]:0,B+=i<l?0:a[i],i++);
        System.out.println(Arrays.toString(a)+" "+x+" "+y+" "+A+" "+B);
        return r;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,7,2},new int[] {4,6,5,1}));
		System.out.println(solution(new int[] {1,2,1,2},new int[] {1,10,1,2}));
		System.out.println(solution(new int[] {1,1},new int[] {1,5}));
	}

}
