package TA;

import java.io.*;

public class JarResult_Test {

    static StringBuffer sb = new StringBuffer();
    static int flag;
    public static void execCmd(String cmd) {
	System.out.println(cmd);
	try {
	    Process process = Runtime.getRuntime().exec("cmd /c " + cmd);
	    BufferedReader reader = new BufferedReader(
		    new InputStreamReader(process.getInputStream()));
	    String line = null;
	    sb.append(cmd+"\n\n");
	    int i=0;
	    while ((line = reader.readLine()) != null) {
		i++;
		String[]arr=line.split("\\.");
		if(arr[arr.length-1].equals("jar")){
		    flag=1;
		    execCmd("java -jar "+line);
		    flag=0;
		}
		if(flag>0){
		    sb.append(line);
		    sb.append("\n");
		}
	    }
	    if(i<1)sb.append("line is empty. might error.\n");
	    sb.append(flag>0?"\n":"");
	} catch (Exception e) {
	    System.out.println("err");
	    e.printStackTrace();
	}
	return;
    }
    public static void main(String[] args) {
	System.out.println("Program is running...");
	execCmd("cd \"C:\\Users\\nn\\OneDrive - 성공회대학교\\TA\\22_1학기\\_알고리즘\\[2022-1학기-알고리즘-01][hw4_1]예약정보정렬\" & dir /b/oe/on");
	System.out.print("Result: \n"+sb);

    }

}