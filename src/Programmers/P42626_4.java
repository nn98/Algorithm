package Programmers;
import java.util.*;
public class P42626_4 {
	static int solution(int[] scoville, int K) {
		int answer = 0;
        TreeSet<Integer> tree = new TreeSet<>();

        for(int s:scoville) {
            tree.add(s);
        }

        while(tree.lower(K)!=null) {
            if(tree.size() == 1) {
                return -1;
            }

            int firstMinScoville = tree.first();
            tree.remove(firstMinScoville);
            int secondMinScoville = tree.first();
            tree.remove(secondMinScoville);

            tree.add(firstMinScoville + (secondMinScoville*2));
            answer++;
        }

        return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,9,10,12},7));
		System.out.println(solution(new int[] {1,2,3,9,10,12},5000));
		System.out.println(solution(new int[] {1000000,1000000,1000000,1000000,1000000,1000000},10000000));
	}

}
