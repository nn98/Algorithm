package Programmers.Data_Structure;

import java.util.*;
import java.util.stream.Collectors;

public class P42587 {

    public static int solution(int[] priorities, int location) {
        int nowIndex = 0;
        int remain = priorities.length;
        int count = 0;

        List<Integer> remainPriorities = Arrays.stream(priorities)
                .boxed().sorted().collect(Collectors.toCollection(ArrayList::new)).reversed();

        while(remain > 0) {
            // nowIndex = priorities.indexOf(remainPriorities.getFirst())
            if (priorities[nowIndex] == remainPriorities.getFirst()) {
                count += 1;
                if (nowIndex == location) return count;
                priorities[nowIndex] = -1;
                remainPriorities.removeFirst();
                remain--;
            }
            nowIndex++;
            nowIndex %= priorities.length;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
