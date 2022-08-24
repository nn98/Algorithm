package Programmers;

import java.util.Arrays;
//날먹 실패
public class P118667_3 {
	static int h[][],r=Integer.MAX_VALUE,a[],l;
	static void o(int x,int y,int c,long X,long Y) {
		x%=l*2;
		y%=l*2;
		h[x][y]++;
		if(X==Y)r=r<c?r:c;
		if(h[x+1][y]<0)o(x+1,y,c+1,X-a[x],y+a[x]);
		if(h[x][y+1]<0)o(x,y+1,c+1,X+a[y],y+a[y]);
	}
	static public int solution(int[] q, int[] p) {
		l=q.length;
		a=new int[l*2];
        int i=0,x=0,y=l,r=0,c=0;
        long A=0,B=0;
        for(;i<l*2;a[i]=i<l?q[i]:p[i%l],A+=i<l?a[i]:0,B+=i<l?0:a[i],i++);
        o(x,y,0,A,B);
        System.out.println(Arrays.toString(a));
        return r;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,7,2},new int[] {4,6,5,1}));
		System.out.println(solution(new int[] {1,2,1,2},new int[] {1,10,1,2}));
		System.out.println(solution(new int[] {1,1},new int[] {1,5}));
	}

}
