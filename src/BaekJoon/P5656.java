package BaekJoon;
import java.util.Scanner;

public class P5656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.nextLine();
		int i=1;
		while(true) {
			if(in.contains("E")) break;
			else if(in.contains("==")) {
				String[] arr=in.split(" == ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])==Integer.parseInt(arr[1])));
			}
			else if(in.contains("!=")) {
				String[] arr=in.split(" != ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])!=Integer.parseInt(arr[1])));
			}
			else if(in.contains(">=")) {
				String[] arr=in.split(" >= ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])>=Integer.parseInt(arr[1])));
			}
			else if(in.contains("<=")) {
				String[] arr=in.split(" <= ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])<=Integer.parseInt(arr[1])));
			}
			else if(in.contains(">")) {
				String[] arr=in.split(" > ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])>Integer.parseInt(arr[1])));
			}
			else if(in.contains("<")) {
				String[] arr=in.split(" < ");
				System.out.println("Case "+i+": "+(Integer.parseInt(arr[0])<Integer.parseInt(arr[1])));
			}
			i++;
			in=s.nextLine();
		}
	}

}
