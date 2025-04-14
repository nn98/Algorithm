package BaekJoon.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P1446 {
    static class Vertex implements Comparable<Vertex>{
        String title;
        List<Edge> edge;
        int distance, index;
        boolean visited;
        public Vertex(String titile) {
            this.title = titile;
            edge = new LinkedList<>();
        }
        @Override
        public int compareTo(Vertex v) {
            return this.distance - v.distance;
        }

        @Override
        public String toString() {
            return "Vertex{" +
                    "title='" + title + '\'' +
                    ", edge=" + edge +
                    ", distance=" + distance +
                    ", index=" + index +
                    ", visited=" + visited +
                    '}';
        }
    }
    static class Edge{
        @Override
        public String toString() {
            return "Edge{" +
                    "weight=" + weight +
                    ", vertex=" + vertex +
                    '}';
        }

        int weight;
        Vertex vertex;
        public Edge(int weight, Vertex vertex) {
            this.weight = weight;
            this.vertex = vertex;
        }
    }

    static class VertexHeap {
        Vertex[] a;
        int end;
        public VertexHeap(Vertex[]a) {
            this.a=a.clone();
            this.end=a.length-1;
            buildHeap();
            for(int i=0;i<a.length;i++) {
                a[i].distance=Integer.MAX_VALUE;
                a[i].index=i;
            }
        }
        public Vertex extracMin() {
            Vertex m = a[0];
            a[0]=a[end];
            --end;
            heapifyDown(0);
            return m;
        }
        public int size() { return end+1; }
        public void swap(int i,int j) {
            Vertex t = a[i];
            a[i] = a[j];
            a[j] = t;
            a[i].index=i;
            a[j].index=j;
        }
        public void buildHeap() {
            for(int i=end/2;i>=0;i--) heapifyDown(i);
        }
        public void heapifyDown(int k) {
            int l = 2* k, r = 2* k +1;
            int min;
            if(r<=end)min=(a[l].compareTo(a[r])<0)?l:r;
            else if(l<end) min=l;
            else return;
            if(a[min].compareTo(a[k])<0) {
                swap(k,min);
                heapifyDown(min);
            }
        }
        public void heapifyUp(int k) {
            while(k>0) {
                int parent = (k-1)/2;
                if(a[parent].compareTo(a[k])<0) break;
                swap(parent,k);
                k=parent;
            }
        }
    }
    static void dijkstra(Vertex[] V, Vertex start, HashMap<Vertex, Vertex> prev) {
        VertexHeap heap = new VertexHeap(V);
        start.distance=0;
        heap.heapifyUp(start.index);
        while(heap.size()>0) {
            Vertex u = heap.extracMin();
            u.visited=true;
            for (Edge e:u.edge) {
                Vertex v = e.vertex;
                if(v.visited==false&&v.distance>u.distance+e.weight) {
                    v.distance=u.distance+e.weight;
                    heap.heapifyUp(v.index);
                    prev.put(v,u);
                }
            }
        }
    }
//    static Vertex[] createGraph() {Vertex[] V = new Vertex[] {new Vertex("A"), new Vertex("B"), new Vertex("C"), new Vertex("D"),new Vertex("E"), new Vertex("F"), new Vertex("G"), new Vertex("H") };final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6, H = 7;V[A].edge = new Edge[] { new Edge(11, V[B]), new Edge(9, V[C]), new Edge(8, V[D]) };V[B].edge = new Edge[] { new Edge(8, V[E]), new Edge(8, V[F]) };V[C].edge = new Edge[] { new Edge(3, V[B]), new Edge(6, V[D]), new Edge(1, V[G]) };V[D].edge = new Edge[] { new Edge(10, V[G]) };V[E].edge = new Edge[] { new Edge(7, V[F]) };V[F].edge = new Edge[] { new Edge(12, V[C]), new Edge(5, V[H]) };V[G].edge = new Edge[] { new Edge(2, V[H]) };V[H].edge = new Edge[] { new Edge(4, V[E]) };return V;}
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        Vertex[] V = new Vertex[152];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
//            if(V[i]==null) V[i]=new Vertex(String.valueOf(i));
            if(V[from]==null) V[from]=new Vertex(String.valueOf(from));
            if(V[to]==null) V[to]=new Vertex(String.valueOf(to));
            if(V[from].edge.size()==0)V[from].edge.add(new Edge(target-from,new Vertex(String.valueOf(target))));
            if(V[to].edge.size()==0)V[to].edge.add(new Edge(target-to,new Vertex(String.valueOf(target))));
            V[from].edge.add(new Edge(distance,V[to]));
        }
        for(Vertex v:V) {
            System.out.println(v);
        }
        HashMap<Vertex, Vertex> previous = new HashMap<>();
        dijkstra(V, V[0], previous);
        for (Vertex v : V) {
            Vertex parent = previous.get(v);
            System.out.printf("Vertex:%s parent:%s distance:%d%n",v.title, parent != null ? parent.title : "", v.distance);
        }

    }
}
