package BaekJoon;
import java.util.*;class P2003_S{public static void main(String[]z){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],f=0,sum=0,r=0;for(int i=0;i<n;i++){a[i]=s.nextInt();sum+=a[i];while(sum>m)sum-=a[f++];if(sum==m)r++;}System.out.print(r);}}