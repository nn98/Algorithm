package Algorithm_Practice._Another;

public class PrimeNumber {

	public static void main(String[] args) {
		int z=10000001,i=1,j;
		boolean[]a=new boolean[z];
		a[i]=true;
		for(;i<z;i++)
			if(!a[i])
				for(j=i*2;j<z;j+=i)
					a[j]=true;
		for(i=0;i++<20;System.out.println(i+" "+a[i]));
	}

}
