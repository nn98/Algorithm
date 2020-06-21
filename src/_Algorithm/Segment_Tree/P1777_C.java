package _Algorithm.Segment_Tree;
// 걍 직관적으로 리스트로 짜도 되네

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1777_C {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		StringTokenizer str = new StringTokenizer(sc.readLine());
		int[] sun = new int[N];
		for(int i=0; i<N; i++){
			sun[i] = Integer.parseInt(str.nextToken());
		}
		List Is = new ArrayList();
		for(int i=0; i<N; i++){
			if(sun[i] == 0) Is.add(i+1);
			else{
				Is.add(Is.size()-sun[i], i+1);
			}
			System.out.println(Is);
		}
		for(int i=0; i<Is.size(); i++){
			System.out.print(Is.get(i));
			if(i != Is.size()-1) System.out.print(" ");
		}
	}
}