package Programmers;

import java.util.Arrays;

public class P118668 {
	static int solution(int alp, int cop, int[][] p) {
        int a=0,x=0,y=0,i=0;
        Arrays.sort(p,(X,Y)->Y[0]-X[0]);
        for(int[]b:p)System.out.println(Arrays.toString(b));
        return a;
    }
	public static void main(String[] args) {
		System.out.println(solution(10,10,new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
		System.out.println(solution(0,0,new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}

}
