package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P26004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        int[] a = new int[26];
        for (char c : s.nextLine().toCharArray())
            a[c - 'A']++;
        System.out.println(Math.min(a['H' - 'A'], Math.min(a['I' - 'A'],
                Math.min(a['A' - 'A'], Math.min(a['R' - 'A'], a['C' - 'A'])))));
    }
}
