package _Algorithm.Simple_Implementation;

public class P20540 {

	public static void main(String[] args) {
		for(char c:new java.util.Scanner(System.in).next().toCharArray())System.out.print(c=='E'?'I':""+(c=='I'?'E':"")+(c=='N'?'S':"")+(c=='F'?'T':"")+(c=='P'?'J':"")+(c=='S'?'N':"")+(c=='T'?'F':"")+(c=='J'?'P':""));
	}

}
