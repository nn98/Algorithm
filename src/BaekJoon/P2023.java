package BaekJoon;

public class P2023 {
	public static void main(String[] args) {
		int z=100000000,i=1,j;
		boolean[]a=new boolean[z];
		a[i]=true;
		for(;i<z;i++)
			if(!a[i])
				for(j=i*2;j<z;j+=i)
					a[j]=true;
		for(i=0;i++<20;System.out.println(i+" "+a[i]));
	}

}