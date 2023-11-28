package BaekJoon.Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P23832 {

    static boolean isGCDZero(int a, int b) {
        int temp = b;
        while (true) {

            b = a % b;
            if (b == 0) {
                return temp == 1;
            }
            a = temp;

        }
    }

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int i = N - 1;
        int[] arr = new int[N + 1];
        for (; N > 1; N--) {
            for (int j = i - 1; j > 1; j--) {

            }
        }

    }
}
