package Programmers;

public class P42583 {
    static public int solution(int b, int w, int[] t) {
        int answer = 0, r = 0, i = 0, j, v = 0;
        for (; i < t.length; ) {
            v += t[i++];
            if (v > w) {
                v -= t[--i];
                r++;
                v = 0;
            }
        }
        return ++r * b;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

}
