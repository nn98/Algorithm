package TA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunJarResultAll {

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
	execCmd("dir /b/oe/on");
	System.out.print("Result: \n"+sb);

    }

}