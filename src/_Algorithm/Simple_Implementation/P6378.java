package _Algorithm.Simple_Implementation;
import java.util.*;
public class P6378 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;;) {
			char[]a=s.next().toCharArray();
			if(a.length<2&a[0]=='0')break;
			while(a.length>1) {
				int i=0;
				for(char c:a)i+=c-'0';
				a=String.valueOf(i).toCharArray();
			}
			System.out.println(a);
		}
	}
}