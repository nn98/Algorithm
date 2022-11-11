package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P6322 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),i=0;
        for(;a+b+c>0;) {
            char x=0;
            double r=-1;
            if(a<0){
                x=97;
                if(b<c)r=Math.sqrt((c*c)-(b*b));
            }
            if(b<0){
                x=98;
                if(a<c)r=Math.sqrt((c*c)-(a*a));
            }
            if(c<0){
                x=99;
                r=Math.sqrt((a*a)+(b*b));
            }
            System.out.println(String.format("Triangle #%d\n%s\n",++i,r<0?"Impossible.":String.format("%c = %.3f",x,r)));
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
        }
    }
}
