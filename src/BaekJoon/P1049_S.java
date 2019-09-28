package BaekJoon;
//아니 시발 거의다맞았었는데 ㄴㅋ애ㅑㄹ콘ㅇ래ㅑㅈ도래ㅑㅋ느랴ㅐ
import java.util.*;class P1049_S{public static void main(String[]z){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=s.nextInt(),a=1000,b=1000,i;while(m-->0){i=s.nextInt();a=i<a?i:a;i=s.nextInt();b=i<b?i:b;}System.out.print(a<6*b?n/6*a+(n%6*b<a?n%6*b:a):n*b);}}