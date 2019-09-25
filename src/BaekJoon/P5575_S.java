package BaekJoon;

import java.util.*;class P5575_S {public static void main(String[]Z) {Scanner s=new Scanner(System.in);for(int i=0;i<3;i++) {int h=s.nextInt(),m=s.nextInt(),z=s.nextInt();h=s.nextInt()-h;m=s.nextInt()-m;z=s.nextInt()-z;if(z<0){m--;z+=60;}if(m<0){h--;m+=60;}System.out.println(h+" "+m+" "+z);}}}