package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P5666 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String[]a=s.nextLine().split(" ");
            System.out.println(String.format("%.2f",Double.parseDouble(a[0])/Double.parseDouble(a[1])));
        }
    }
}
