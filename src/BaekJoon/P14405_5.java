package BaekJoon;

public class P14405_5 {
//??????????????????????????????????
	public static void main(String[] args) {
		char[]a=new char[5001];
		int i=0,con=0;
		for(char j:new java.util.Scanner(System.in).next().toCharArray())
			a[i++]=j;
		i=0;
		
		while(a[i] != '\0'){
	        if(a[i]=='p'&&a[i+1]=='i')
	            i+=2;
	        else if(a[i]=='k'&&a[i+1]=='a')
	            i+=2;
	        else if(a[i]=='c'&&a[i+1]=='h'&&a[i+2]=='u')
	            i+=3;
	        else{
	            con =1;
	            break;
	        }
	    }
	    if(con == 0)
	        System.out.print("YES");
	    else
	        System.out.print("NO");
	}

}
