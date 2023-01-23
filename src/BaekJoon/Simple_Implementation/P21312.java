package BaekJoon.Simple_Implementation;

import java.util.Arrays;

public class P21312 {
    public static void main(String[] args) {
        String[] a = new java.util.Scanner(System.in).nextLine().split(" ");
        int j=0, b[] = {
                Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]),
                Integer.parseInt(a[0]) * Integer.parseInt(a[1]), Integer.parseInt(a[1]) *
                Integer.parseInt(a[2]), Integer.parseInt(a[0]) * Integer.parseInt(a[2]),
                Integer.parseInt(a[0]) * Integer.parseInt(a[1]) * Integer.parseInt(a[2])};
        Arrays.sort(b);
        j = b[0];
        for (int i = 0; i++ < 6; )
            if (j % 2 == b[i] % 2) j = Math.max(j, b[i]);
            else if (j % 2 == 0 & b[i] % 2 == 1) j = b[i];
        System.out.println(j);
    }
}
