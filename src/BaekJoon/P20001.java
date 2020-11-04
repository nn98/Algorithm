package BaekJoon;
import java.util.*;
class P20001{
public static void main(String[]z){
Scanner s=new Scanner(System.in);
int m=0;
String a=s.nextLine();
while(!(a=s.nextLine()).equals("고무오리 디버깅 끝")){
switch(a){
case "고무오리":
if(m>0)m--;
else m+=2;
break;
case "문제":
m++;
break;
}
}
System.out.print(m==0?"고무오리야 사랑해":"힝구");
}}