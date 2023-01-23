package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P17094 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a = 0, b = 0;
        for (char c : s.next().toCharArray()) {
            if (c == '2')
                a++;
            else
                b++;
        }
        System.out.println(a > b ? 2 : (b > a ? "e" : "yee"));
    }
}
