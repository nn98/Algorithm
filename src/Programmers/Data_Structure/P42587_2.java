package Programmers.Data_Structure;

import java.util.*;
import java.util.stream.Collectors;

public class P42587_2 {

    public static int solution(int[] priorities, int location) {
        Queue<Integer[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<priorities.length;i++) {
            Integer[] value = new Integer[]{priorities[i], i};
            queue.add(value);
            priorityQueue.add(priorities[i]);
        }
        int count = 0;
        while(!priorityQueue.isEmpty()) {
            Integer[] value = queue.poll();
            if (Objects.equals(value[0], priorityQueue.peek())) {
                count += 1;
                if (value[1] == location) {
                    return count;
                }
                priorityQueue.poll();
                continue;
            }
            queue.add(value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
