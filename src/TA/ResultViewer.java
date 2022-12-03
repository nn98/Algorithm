package TA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ResultViewer {

    final static int CMD_LINE = 65;

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("result.txt"), "UTF-8")),
                er = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineCount = 1;
        int index = 0;
        char[] a = new char[10240];
        r.read(a);
        String text = String.valueOf(a);
        String[] temp = text.split("\n");
        String line = "";

        List<StringBuffer> bufferList = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();

        while (index < temp.length) {

            line = temp[index++];
            if (line.length() > 1) {
                if (line.substring(0, 2).equalsIgnoreCase("hw") || line.substring(0, 2).equals("ja")) {
                    for (; lineCount < CMD_LINE; ++lineCount) {
                        buffer.append("\n");
                    }
                    bufferList.add(buffer);

                    buffer = new StringBuffer();
                    lineCount = 1;
                }
            }
            buffer.append(line + "\n");
            lineCount++;
        }

        bufferList.add(buffer);

        for (int i = 0; i < bufferList.size(); ) {
            w.write(bufferList.get(i).toString());
            w.flush();
            String input = er.readLine();
            if (input.equals("")) {
                i++;
            } else {
                i--;
            }
        }

    }

}
