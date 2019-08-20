import java.util.Scanner;

public class P1252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		int a=Integer.parseInt(s.next()),b=Integer.parseInt(s.next());
		String in1=s.next(),in2=s.next();
		int aa=0,bb=0;
		while(in1.charAt(aa)=='0') aa++;
		while(in2.charAt(bb)=='0') bb++;
		in1=in1.substring(aa);
		in2=in2.substring(bb);
		String[] a=in1.split(""),b=in2.split("");
		int c=0,d=0;
		
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[(a.length-1)-i].equals("1")) c+=Math.pow(2, i);
		}
		for(int i=b.length-1;i>=0;i--) {
			if(b[(b.length-1)-i].equals("1")) d+=Math.pow(2, i);
		}
//		System.out.println("c: "+c+" d: "+d);
		int sum=c+d,con=1,count=0;
		String r="";
		while(sum>1) {
//			System.out.println("sum: "+sum+" r+="+sum%2);
			r+=sum%2;
			sum/=2;
		}
		r+=sum;
		StringBuilder t=new StringBuilder(r);
		t=t.reverse();
		System.out.println(t);
	}

}
