package BaekJoon;

import java.util.*;

public class P11650_S {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t = 100000;
        int n = sc.nextInt();
        long[] data = new long[n];
        for (int i = 0; i < n; i++){
            long x = sc.nextInt() + t, y = sc.nextInt() + t;
            data[i] = x<<20 | y;
        }
        Arrays.sort(data);
        for (long e:data){
            System.out.println((e>>20)-t + " " + ((e & ((1<<20) - 1)) - t));
        }

    }
}