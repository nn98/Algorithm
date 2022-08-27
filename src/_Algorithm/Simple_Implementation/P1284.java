package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P1284 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(String a=s.next();!a.equals("0");a=s.next()) {
			int i=1;
			for(char b:a.toCharArray()) {
				switch(b) {
				case '0':
					i+=4;
					break;
				case '1':
					i+=2;
					break;
				default:
					i+=3;
					break;
				}
				i++;
			}
			System.out.println(i);
		}
	}
}