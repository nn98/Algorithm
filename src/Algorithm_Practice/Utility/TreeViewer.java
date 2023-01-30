package Algorithm_Practice.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TreeViewer {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[]input=reader.readLine().split(", ");
        boolean isBeginZero=true;
        System.out.print("Are indexes starting at 0?\n(Y: anything / N: ) ");
        if(reader.readLine().equals("")){
            isBeginZero=false;
        }
        int depth=(int)Math.ceil(Math.sqrt(input.length-(isBeginZero?1:0)));
        int size=(int)Math.pow(2,depth);
        System.out.println(depth+" "+size);
        int count=0;
        int coefficient=1;
        int maxLength;
        for(int i=isBeginZero?0:1;i<size;){
            StringBuffer sb=new StringBuffer();
            for(int blank=0;blank<depth;blank++,sb.append(" "));
            for(;count<coefficient;count++,i++)sb.append(input[i].trim().replaceAll("[^0-9]","")+" ");
            depth--;
            count=0;
            coefficient*=2;
            System.out.println(sb);
        }
    }
}
