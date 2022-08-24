package Programmers;

import java.util.Arrays;
//날먹 실패
public class P118667_3 {
	static int h[][],r,a[],l;
	static void o(int x,int y,int c,long X,long Y) {
		x%=l*2;
		y%=l*2;
//		System.out.println(String.format("x:%d y:%d c:%d X:%d Y:%d %b",x,y,c,X,Y,X==Y));
		h[x][y]++;
		if(X==Y)r=r<c?r:c;
		if(x<l*2-1)if(h[x+1][y]<1)o(x+1,y,c+1,X-a[x],Y+a[x]);
		if(y<l*2-1)if(h[x][y+1]<1)o(x,y+1,c+1,X+a[y],Y-a[y]);
	}
	static public int solution(int[] q, int[] p) {
		r=Integer.MAX_VALUE;
		l=q.length;
		a=new int[l*2];
		h=new int[l*2][l*2];
        int i=0,x=0,y=l;
        long A=0,B=0;
        for(;i<l*2;a[i]=i<l?q[i]:p[i%l],A+=i<l?a[i]:0,B+=i<l?0:a[i],i++);
        o(x,y,0,A,B);
        System.out.println(Arrays.toString(a));
        return r==Integer.MAX_VALUE?-1:r;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,7,2},new int[] {4,6,5,1}));
		System.out.println(solution(new int[] {1,2,1,2},new int[] {1,10,1,2}));
		System.out.println(solution(new int[] {1,1},new int[] {1,5}));
	}

}
