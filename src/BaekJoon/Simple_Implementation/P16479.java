package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P16479 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt(),a=s.nextInt(),b=s.nextInt();
        System.out.println(a==b?k*k:k*k-Math.abs(a-b)/(double)2*Math.abs(a-b)/(double)2);
    }
}
