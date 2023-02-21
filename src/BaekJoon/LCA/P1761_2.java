package BaekJoon.LCA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1761_2 {
    static class Connection{
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
    static int n,m,i,h[],v[],treeidx[],l=1,count,j,left,right,result;
    static Connection[]tree;
    static List<List<Connection>> connections;
    static void o(int x,int depth,int total){
        h[x]=1;
        if(x!=1){
            v[x]=total;
        }
        tree[l+count++]=new Connection(depth,x);
        if(treeidx[x]==0)treeidx[x]=count;
        for(Connection c: connections.get(x)){
            if(h[c.target]<1){
                o(c.target,depth+1,c.value+total);
                tree[l+count++]=new Connection(depth,x);
            }
        }
    }
    static void p(int x,int v){
//        System.out.println(x+" "+v);
        h[x]=1;
        if(x==left|x==right){
            result+=v;
            if(left!=1&right!=1)return;
        }
        for(Connection c: connections.get(x)){
            if(h[c.target]<1){
                p(c.target,c.value+v);
            }
        }
    }
    static Connection cmp(Connection a,Connection b){
        if(b==null)return a;
        if(a==null)return b;
        return a.target<b.target?a:b;
    }
    static void init(){
        for(;j>1;j/=2,tree[j]=cmp(tree[j*2],tree[j*2+1]));
    }
    static Connection min(int n,int s,int e){
        if(s>j|e<i)return null;
        if(i<=s&e<=j)return tree[n];
        int m=(s+e)/2;
        return cmp(min(n*2,s,m),min(n*2+1,m+1,e));
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
        treeidx=new int[n+1];
        int leaf=2*n-1;
        for(;l<leaf;l*=2);
//        System.out.println("leaf: "+leaf+" l: "+l);
        tree=new Connection[l*2];
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
//        for(List<Connection> c:connections) System.out.println(c);
        o(1,0,0);
//        System.out.println(Arrays.toString(v));
        for(i=0;i<leaf;j=l+i++,init());
//        System.out.println(Arrays.toString(treeidx));
//        System.out.println(Arrays.toString(tree));
//        for(List<Connection> c:connections) System.out.println(c);
        m=Integer.parseInt(reader.readLine());
        for(;m-->0;){
            String[]input=reader.readLine().split(" ");
            left=Integer.parseInt(input[0]);
            right=Integer.parseInt(input[1]);
            i=treeidx[left];
            j=treeidx[right];
            if(i>j){
                int t=i;
                i=j;
                j=t;
            }
            Connection lca=min(1,1,l);
//            System.out.println(lca);
//            h=new int[n+1];
            result=v[left]+v[right]-2*v[lca.value];
//            p(lca.value,0);
            writer.write(result+"\n");
        }
        writer.flush();
    }
}
/*
https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=jh20s&logNo=221339300027
9
1 2 1
1 3 1
2 4 1
4 9 1
2 5 1
2 6 1
3 7 1
3 8 1
 */