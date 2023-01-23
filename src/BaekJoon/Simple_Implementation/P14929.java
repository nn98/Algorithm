package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P14929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 0, a[] = new int[n + 1], b[] = new int[n + 1];
        long r = 0;
        for (; i++ < n; b[i] = a[i] = scanner.nextInt(), a[i] += +a[i - 1]) ;
        for(i=1;i++<n;r+=b[i]*a[i-1]);
        System.out.println(r);
    }
}
