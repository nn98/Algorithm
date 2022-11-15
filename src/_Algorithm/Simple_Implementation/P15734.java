package _Algorithm.Simple_Implementation;

public class P15734 {
    public static void main(String[] args) {
        String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
        int b=Integer.parseInt(a[0]),c=Integer.parseInt(a[1]),d=Integer.parseInt(a[2]);
        for(;d>0;){
            if(b<c){
                b++;
                d--;
            }else {
                c++;
                d--;
            }
        }
        System.out.print((b<c?b:c)*2);
    }
    
}
