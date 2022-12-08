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
            if (index == temp.length) {
                for (; ++lineCount < CMD_LINE; ) {
//                        w.newLine();
                    buffer.append("\n");
                }
                buffer.append(bufferList.size() + "\tEnter - Next / Else - Prev");
//                    w.flush();
                bufferList.add(buffer);
                break;
            }

            boolean flag = false;

            if (line.length() > 1) {
//            intelliJ - toLowerCase.equals 대신 equalsIgnoreCase 굳
                if (line.substring(0, 2).equalsIgnoreCase("hw") || line.substring(0, 2).equals("ja")) {
                    for (; ++lineCount < CMD_LINE; ) {
//                        w.newLine();
                        buffer.append("\n");
                    }
                    buffer.append(bufferList.size() + "\tEnter - Next / Else - Prev");
//                    w.flush();
                    bufferList.add(buffer);

                    buffer = new StringBuffer();
                    lineCount = 1;
//                    er.readLine();
                }

            }
            if (line.length() > 2) {
                if (line.substring(0, 3).equalsIgnoreCase("lab") || line.substring(0, 2).equals("jav")) {
                    for (; ++lineCount < CMD_LINE; ) {
//                        w.newLine();
                        buffer.append("\n");
                    }
                    buffer.append(bufferList.size() + "\tEnter - Next / Else - Prev");
                    bufferList.add(buffer);

                    buffer = new StringBuffer();
                    lineCount = 1;
                }
            }
            buffer.append(line + "\n");
            lineCount++;
        }

        bufferList.add(buffer);

        for (int i = 0; ; ) {
            if (i < 0) {
                w.write("********** First Page **********\n");
                i = 0;
            }
            if (i >= bufferList.size()) {
                w.write("********** Last Page **********\n");
                i = bufferList.size() - 1;
            }
            w.write(bufferList.get(i).toString());
            w.flush();
            String input = er.readLine();
            if (input.equals("")) {
                i++;

            } else {
                try {
                    i = Integer.parseInt(input);
                } catch (Exception e) {
                    i--;
                }
            }
        }

    }

}
