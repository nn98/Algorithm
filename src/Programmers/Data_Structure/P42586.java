package Programmers.Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> taskProgresses = new LinkedList<>();
        for (int progress : progresses) {
            taskProgresses.offer(progress);
        }
        int targetIndex = 0;
        int weight = 0;
        List<Integer> answer = new ArrayList<>();
        while (!taskProgresses.isEmpty()) {
            int firstProgress = taskProgresses.peek();
            double workDay = Math.ceil(
                    (double) (100 - (firstProgress + speeds[targetIndex] * weight)) / speeds[targetIndex]);
            weight += (int) workDay;
            int finished = 0;
            while (!taskProgresses.isEmpty() && taskProgresses.peek() + speeds[targetIndex] * weight >= 100) {
                finished += 1;
                targetIndex += 1;
                taskProgresses.poll();
            }
            answer.add(finished);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{99, 10, 9}, new int[]{1, 1, 1})));
    }

}
