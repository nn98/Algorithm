import java.io.*;

public class SQL_Query_Generator {
    public static void main(String[]z)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("Select option: (1-Student talbe generator 2-Learn talbe generator) ");
        switch(r.readLine()) {
        case "1":
            for(;;){
                String s[]=r.readLine().split("\t");
                if(s.length<3)break;
                w.write(String.format("insert into Student values (%s,\"%s\",\"%s\");\n", s[0], s[1], s[2]));
            }
        	break;
        case "2":
            for(;;){
            	System.out.println("Input Lecture ID: ");
                String lID=r.readLine(),s=r.readLine();
                if(s.length()<2)break;
                w.write(String.format("insert into Learn values (%s,\"%s\");\n", s,lID));
            }
        	break;
        }
        w.flush();
    }
}
