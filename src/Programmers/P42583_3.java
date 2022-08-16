package Programmers;

public class P42583_3 {
	static public int solution(int b, int w, int[] t) {
		int a=1,r=1,i=0,v=0,c[]=new int[1000000000];
		for(;i<t.length;i++) {
			if(v+t[i]<=w) {
				v+=t[i];
			}else {
				a++;
				r++;
				v=t[i];
			}
		}
		return a+b*r;
	}
	public static void main(String[] args) {
		System.out.println(solution(2,10,new int[] {7,4,5,6}));
		System.out.println(solution(100,100,new int[] {10}));
		System.out.println(solution(100,100,new int[] {10,10,10,10,10,10,10,10,10,10}));
	}

}
