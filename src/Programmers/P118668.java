package Programmers;
// 1차원적 생각 실패!
import java.util.Arrays;

public class P118668 {
	static int solution(int alp, int cop, int[][] p) {
		int a=0,c=0,j,i,l=p.length,h[]=new int[l],ti,tt,k;
		Arrays.sort(p,(X,Y)->X[0]==Y[0]?X[1]-Y[1]:X[0]-X[0]);
		//        for(int[]b:p)System.out.println(Arrays.toString(b));
		for(;c<l;) {
			for(i=0;i<l;i++) {
				if(h[i]<1) {
					if(alp<p[i][0]|cop<p[i][1]) {
						ti=0;
						tt=100;
						for(j=0;j<l;j++) {
							if(h[j]>0) {
								for(k=0;++k<20;) {
									if(alp+p[j][2]*k>=p[i][0]&cop+p[j][3]*k>=p[i][1]) {
										if(k*p[j][4]<tt) {
											ti=j;
											tt=k*p[j][4];
										}
										break;
									}
								}
							}
						}
						k=0;
						if(alp<p[i][0])k+=p[i][0]-alp;
						if(cop<p[i][1])k+=p[i][1]-cop;
						System.out.println(String.format("ti:%d tt:%d k:%d",ti,tt,k));
						if(k<tt) {
							System.out.println("sel k");
							alp=p[i][0];
							cop=p[i][1];
							a+=k;
						}else {
							System.out.println("sel tt");
							alp+=p[ti][2]*(tt/p[ti][4]);
							cop+=p[ti][3]*(tt/p[ti][4]);
							a+=tt;
						}
					}
					h[i]++;
					c++;
				}
				System.out.println(alp+" "+cop+" "+a+" "+Arrays.toString(h));
			}
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(solution(10,10,new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
		System.out.println(solution(0,0,new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}

}
