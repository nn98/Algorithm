package Algorithm_Practice.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subtitles {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        int number=Integer.parseInt(reader.readLine());
        StringBuffer stringBuffer=new StringBuffer();
        while(true){
            String line= reader.readLine();
            if(line.equals("")){
                reader.readLine();
                reader.readLine();
            } else if (line.equals("xx")) break;
            else stringBuffer.append(line+"\n");
        }
        System.out.println(stringBuffer);
    }
}
