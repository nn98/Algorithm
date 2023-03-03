package Programmers;

import java.util.*;

public class P12938 {
    // 아니이게왜 3레벨이야 병신임?
    static class Solution {
        public int[] solution(int n, int s) {
            int[] ans = new int[n];
            if (s < n) return new int[]{-1};
            int split = s / n, sum = split * n, mul = (int) Math.pow(split, 2), i = n, mod = s - sum;
            Arrays.fill(ans, split);
            for (; mod > 0; ans[--i]++, mod--) ;
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2, 9));
        System.out.println(solution.solution(2, 1));
        System.out.println(solution.solution(2, 8));
    }
}
