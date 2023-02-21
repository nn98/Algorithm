package BaekJoon.DFS;

import BaekJoon._Contest.c819.C;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class Connection{
    int target;
    int value;
    Connection(int target,int value){
        this.target=target;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "target=" + target +
                ", value=" + value +
                '}';
    }
}
public class P1761 {
    static int n,m,i,h[];
    static List<List<Connection>> connections;
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(reader.readLine());
        for(;++i<n;){
            String[]input=reader.readLine().split(" ");
            int from=Integer.parseInt(input[0]);
            int to=Integer.parseInt(input[0]);
            int value=Integer.parseInt(input[0]);
            if(connections.get(from)==null)connections.add(from,new ArrayList<>());
            Connection connection=new Connection(to,value);
            connections.get(from).add(connection);
            if(connections.get(to)==null)connections.add(to,new ArrayList<>());
            connection=new Connection(from,value);
            connections.get(to).add(connection);
        }
        for(List<Connection> c:connections) System.out.println(c);
    }
}
