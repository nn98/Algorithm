package BaekJoon.Simple_Implementation;

public class P15633{
    public static void main(String[]z){
        int n=new java.util.Scanner(System.in).nextInt(),i=0,u=0;
        for(;++i<Math.sqrt(n);u+=n%i<1?(i+n/i):0);
        System.out.print(u*5-24);
    }
}