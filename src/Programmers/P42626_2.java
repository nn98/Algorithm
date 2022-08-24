package Programmers;

import java.util.*;
import java.util.stream.Collectors;

public class P42626_2 {
	static int solution(int[] s, int K) {
		int a=0,r=0,i=0,l=s.length;
		List<Integer>t=Arrays.stream(s).boxed().collect(Collectors.toList());
		for(;;) {
			Collections.sort(t);
			if(t.get(0)<K) {
				System.out.println(t.size());
				if(t.size()<3)return -1;
				t.add(t.remove(0)+t.remove(1)*2);
				a++;
			}else break;
		}
        return a;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,9,10,12},7));
		System.out.println(solution(new int[] {1,2,3,9,10,12},5000));
	}

}
