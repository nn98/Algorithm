package BaekJoon;
import java.util.*;
public class P5361 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int n=s.nextInt();n-->0;)System.out.println("$"+String.format("%.2f",s.nextInt()*350.34+s.nextInt()*230.90+s.nextInt()*190.55+s.nextInt()*125.30+s.nextInt()*180.90));
	}
}