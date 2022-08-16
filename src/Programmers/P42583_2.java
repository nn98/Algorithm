package Programmers;

public class P42583_2 {
	static public int solution(int b, int w, int[] t) {
		int a=1,r=0,i=0,j,v=0;
		for(;i<t.length;) {
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
