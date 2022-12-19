package _Algorithm.Simple_Implementation;

public class P14913 {
    public static void main(String[] args) {
        String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
        int i=Integer.parseInt(a[0]),j=Integer.parseInt(a[1]),v=Integer.parseInt(a[2])-i;
//        System.out.println(v%j>0|v/j<0?"X":v/j+1);
        System.out.println(v%j==0&v/j>=0?v/j+1:"X");
    }
}
