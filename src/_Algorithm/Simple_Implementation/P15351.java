package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P15351 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a;
        s.nextLine();
        for(;n-->0;){
            a=0;
            for(char c:s.nextLine().toCharArray()){
                if(c>='A')a+=c-64;
            }
            System.out.println(a==100?"PERFECT LIFE":a);
        }
    }
}
