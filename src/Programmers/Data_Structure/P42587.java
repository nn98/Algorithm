package Programmers.Data_Structure;
import java.util.*;
import java.util.stream.Collectors;
public class P42587 {
	static public int solution(int[]p, int x) {
		List<Integer>l=Arrays.stream(p).boxed().collect(Collectors.toList());
		System.out.println(l);
        int answer = 0;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {1,2,3,4},5);
	}

}
