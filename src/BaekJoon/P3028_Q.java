package BaekJoon;

import java.util.Scanner;

public class P3028_Q {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 1;
        String s = sc.next();
        for (int e:s.getBytes()){
            int a =e=='A'?3:e-'A';
            if (a != b)
                b = 6 -a - b;
        }
        System.out.println(b);
    }
}
