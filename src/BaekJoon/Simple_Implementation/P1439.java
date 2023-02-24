package BaekJoon.Simple_Implementation;

public class P1439 {
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).next();
        int o = 0, z = 0, i = 0;
        if (s.charAt(i) == '0') z++;
        else o++;
        for (; ++i < s.length(); ) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '0') z++;
                else o++;
            }
        }
        System.out.println(z<o?z:o);
    }
}
