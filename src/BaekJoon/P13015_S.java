package BaekJoon;
class P13015_S {
	public static void main(String[]z) {
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<n*2;i++) {
			int b=(n-i)*2-1;
			String t="*",l=" ",r="";
			if(i==1||i==n*2-1) {
				for(int j=0;j<n;j++)r+=t;
				if(i<n)for(int j=0;j<b;j++)r+=l;
				else if(i>n)for(int j=0;j<(i-n)*2-1;j++)r+=l;
				for(int j=0;j<n;j++)r+=t;
			}
			else {
				if(i<=n)
					for(int j=1;j<i;j++)r+=l;
				else 
					for(int j=0;j<Math.abs(n*2-1-i);j++)r+=l;

				r+=t;
				for(int j=0;j<n-2;j++)r+=l;
				r+=t;


				if(i<n)for(int j=0;j<b;j++)r+=l;
				else if(i>n)for(int j=0;j<(i-n)*2-1;j++)r+=l;

				if(i!=n)r+=t;
				for(int j=0;j<n-2;j++)r+=l;
				r+=t;
			}
			System.out.println(r);
		}
	}
}