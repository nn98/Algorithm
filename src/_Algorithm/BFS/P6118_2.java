package _Algorithm.BFS;
// + depth 저장방식
// 부모 단계에서 추가한 값의 수 저장, 자식 단계에서 추가한 값의 수 저장, 부모 단계 0이면 자식 -> 부모 
import java.io.*;
import java.util.*;
public class P6118_2{  
    static int n, m, i, j, x, h[], r,P,C;
    static List<Integer>l[];
    static Queue<Integer> q=new LinkedList();

    public static void main(String[] args) throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[]c=b.readLine().split(" ");
        n = Integer.parseInt(c[0]);
        m = Integer.parseInt(c[1]);
        l=new List[n];
        h = new int[n];
        for (; x < m; x++) {
            c=b.readLine().split(" ");
            i = Integer.parseInt(c[0])-1;
            j = Integer.parseInt(c[1])-1;
            if(l[i]==null)l[i]=new ArrayList();
            l[i].add(j);
            if(l[j]==null)l[j]=new ArrayList();
            l[j].add(i);
        }
        x=0;
        i=1;
        h[0]=1;
        q.add(0);
        while(!q.isEmpty()) {
            P--;
            j=q.poll();
            for(int k:l[j]) {
                if(h[k]<1) {
                    if(i>r) {
                        r=i;
                        x=0;
                    }
                    if(i==r)x++;
                    h[k]=i;
                    q.add(k);
                    C++;
                }
            }
            if(P<1) {
                P=C;
                C=0;
                i++;
            }
        }
        for(i=0;++i<n;)if(h[i]==r) {
            j=i;
            break;
        }
        System.out.print(j+1+" "+r+" "+x);
    }

}
