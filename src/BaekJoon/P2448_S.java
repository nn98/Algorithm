package BaekJoon;
import java.util.*;class P2448_S{public static void main(String[]V){int a=new Scanner(System.in).nextInt();String[]T=new String[a];T[0]="  *  ";T[1]=" * * ";T[2]="*****";for(int i=1;i<a/3;i*=2){for(int j=0;j<i*3;j++){T[j+i*3]=T[j]+" "+T[j];for(int k=0;k<i;k++)T[j]="   "+T[j]+"   ";}}for(int i=0;i<a;i++){System.out.println(T[i]);}}}