package BaekJoon.DFS;

import BaekJoon._Contest.c819.C;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    static int n,m,i,h[],v[];
    static List<List<Connection>> connections;
    static void o(int x,List<Connection>route,int total){
        h[x]=1;
        if(x!=1){
            v[x]=total;
        }
        int index=0,values=total;
        for(Connection c: route){
            index++;
            if(index==route.size())break;
            int target=c.target;
            int value=c.value;
            connections.get(x).add(new Connection(target,values));
            values-=value;
        }
        for(Connection c: connections.get(x)){
            if(h[c.target]<1){
                route.add(c);
                o(c.target,route,total+c.value);
                route.remove(route.size()-1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(reader.readLine());
        connections=new ArrayList<>();
        connections.add(null);
        for(;i<n;i++)connections.add(new ArrayList<>());
        h=new int[n+1];
        v=new int[n+1];
        for(i=0;++i<n;){
            String[]input=reader.readLine().split(" ");
            int from=Integer.parseInt(input[0]);
            int to=Integer.parseInt(input[1]);
            int value=Integer.parseInt(input[2]);
//            if(connections.get(from)==null)connections.add(from,new ArrayList<>());
            Connection connection=new Connection(to,value);
            connections.get(from).add(connection);
//            if(connections.get(to)==null)connections.add(to,new ArrayList<>());
            connection=new Connection(from,value);
            connections.get(to).add(connection);
        }
        for(List<Connection> c:connections) System.out.println(c);
        o(1,new ArrayList<>(),0);
        System.out.println(Arrays.toString(v));
        for(List<Connection> c:connections) System.out.println(c);
    }
}
