package TA;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Assignment {

    final static int CMD_LINE = 65;
    static StringBuffer sb = new StringBuffer(), rb = new StringBuffer();
    static int flag;

    public static void execCmd(String cmd) {
        System.out.println(cmd);
        try {
            Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line = null;
            sb.append(cmd + "\n\n");
            int i = 0;
            while ((line = reader.readLine()) != null) {
                i++;
                String[] arr = line.split("\\.");
                if (arr[arr.length - 1].equals("jar")) {
                    flag = 1;
                    execCmd("java -jar " + line);
                    flag = 0;
                }
                if (flag > 0) {
                    sb.append(line);
                    sb.append("\n");
                    rb.append(line);
                    rb.append("\n");
                }
            }
            if (i < 1) {
                sb.append("line is empty. might error.\n");
                rb.append(cmd + "\n");
                rb.append("line is empty. might error.\n");
            }
            sb.append(flag > 0 ? "\n" : "");
            rb.append(flag > 0 ? "\n" : "");
        } catch (Exception e) {
            System.out.println("err");
            e.printStackTrace();
        }
        return;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Program is running...");
        execCmd("dir /b/oe/on");
        System.out.print("Result: \n" + sb);

        OutputStream out = new FileOutputStream("result.txt");
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");

        writer.write(rb.toString());
        writer.close();

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
                buffer.append("Enter - Next / Else - Prev");
//                    w.flush();
                bufferList.add(buffer);
                break;
            }
            if (line.length() > 2) {
                if (line.substring(0, 3).equalsIgnoreCase("lab") || line.substring(0, 2).equals("jav")) {
                    for (; ++lineCount < CMD_LINE; ) {
//                        w.newLine();
                        buffer.append("\n");
                    }
                    buffer.append("Enter - Next / Else - Prev");
                    bufferList.add(buffer);

                    buffer = new StringBuffer();
                    lineCount = 1;
                }
            }
            if (line.length() > 1) {
//            intelliJ - toLowerCase.equals 대신 equalsIgnoreCase 굳
                if (line.substring(0, 2).equalsIgnoreCase("hw") || line.substring(0, 2).equals("ja")) {
                    for (; ++lineCount < CMD_LINE; ) {
//                        w.newLine();
                        buffer.append("\n");
                    }
                    buffer.append("Enter - Next / Else - Prev");
//                    w.flush();
                    bufferList.add(buffer);

                    buffer = new StringBuffer();
                    lineCount = 1;
//                    er.readLine();
                }

            }
            buffer.append(line + "\n");
//            w.write(line + "\n");
            lineCount++;

//            if(temp[index].equals("")&&temp[index+1].equals("")&&temp[index+2].equals("")&&temp[index+3].equals(""))break;
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
