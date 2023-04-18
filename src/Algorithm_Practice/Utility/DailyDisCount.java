package Algorithm_Practice.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DailyDisCount {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//        int lines=Integer.parseInt(reader.readLine());
        int lines = 22;
        int money;
//        StringTokenizer st;
        for (int i = 0; i++ < lines; ) {
//            st = new StringTokenizer(reader.readLine());
            String line = reader.readLine();
            String[] split = line.split("\t");
//            System.out.println(Arrays.toString(split));
            writer.write(split[0]+"\t");
            int j = 0;
            for (; split[++j].equals(""); writer.write("\t")) ;
            money = Integer.parseInt(split[j]);
            money -= 60000;
            if (i >= 2 & i <= 7) money -= 1500;
            writer.write(money+"\t");
            while (j < split.length-1) {
                if (!split[++j].equals("")) writer.write(split[j]);
                writer.write("\t");
            }
            writer.newLine();
        }
        writer.flush();
    }
}
