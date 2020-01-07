package BaekJoon;

public class P14405 {

	static String A(String i) {
		return i.replaceAll("pi","");
	}
	static String B(String i) {
		return i.replaceAll("ka","");
	}
	static String C(String i) {
		return i.replaceAll("chu","");
	}
	public static void main(String[] args) {
		String in=new java.util.Scanner(System.in).next(),a,b,c,d,e,f;
		a=A(in);
		a=B(a);
		a=C(a);
		b=A(in);
		b=C(b);
		b=B(b);
		c=B(in);
		c=A(c);
		c=C(c);
		d=B(in);
		d=C(d);
		d=A(d);
		e=C(in);
		e=B(e);
		e=A(e);
		f=C(in);
		f=A(f);
		f=B(f);
		System.out.print((a.equals("")||b.equals("")||c.equals("")||d.equals("")||e.equals("")||f.equals(""))?"YES":"NO");
	}
}