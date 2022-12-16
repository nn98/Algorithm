package TA;

import java.util.ArrayList;
import java.util.Scanner;

// 가중치 그래프의 간선 정보를 표현하는 클래스
class Edge{
    int v1, v2; // 간선 (v1, v2)를 이루는 정점 번호
    int weight; // 간선 가중치
    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                 v1 +
                ", " + v2 +
                '}';
    }
}

// 크루스칼 알고리즘을 이용하여 최소비용신장트리를 구하는 프로그램
public class Main {
    // 트리를 이용한 상호배타적 집합 표현
    private static int [] parent;

    public static void main(String[] args) {
        System.out.println("hw10_1 : 김선호");

        // 정점 수(n), 간선 수(e)를 입력 받음
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 정점 수 n
        int e = scanner.nextInt(); // 간선 수 e

        // e개의 간선(v1, v2, weight)을 입력 받아 간선 리스트에 삽입
        ArrayList<Edge> edgeList = new ArrayList<>();
        for(int i = 0; i < e; i++) {
            edgeList.add(new Edge(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        }

        // 간선 리스트를 가중치 오름차순으로 정렬
        edgeList.sort((o1, o2) -> {
            return(o1.weight - o2.weight);
        });

        // 트리를 이용한 상호배타적 집합 표현
        parent = new int[n+1]; // 배열 parent를 생성

        // 각 정점으로 구성된 n개의 상호배타적 집합 생성
        for(int x = 1; x <= n; x++) {
            makeSet(x);
        }

        // 오름차순으로 정렬된 edgeList에서 간선을 하나씩 검사하여, 사이클을 형성하지 않으면 트리 간선임.
        int treeEdgeCount = 0; // 트리 간선 수
        int treeWeightSum = 0; // 트리 가중치 합
        for(int i = 0; (i < e) && (treeEdgeCount < n-1); i++) {
            Edge edge = edgeList.get(i);
            if( findSet(edge.v1) != findSet(edge.v2)) {  // 사이클을 형성하지 않으면(즉, edge의 v1, v2가 같은 집합에 속하지 않으면)
                union(edge.v1, edge.v2);   // v1, v2가 속한 집합을 합침
                treeWeightSum += edge.weight;   // 가중치 합에 edge의 가중치를 더함
                treeEdgeCount++;
            }

        }

        // 최소신장트리의 간선 가중치 합을 출력
        System.out.println(treeWeightSum);

        // 최소신장트리 간선 리스트를 출력
        System.out.println(edgeList);
    }
    private static void makeSet(int x) {
        parent[x] = x; // 하나의 원소 x로 구성된 집합 생성
    }
    private static int findSet(int x) {
        if(parent[x] != x) {
            parent[x] = findSet(parent[x]); // x의 대표 원소를 알아냄 - 경로압축 사용
        }
        return parent[x]; // x의 대표 원소를 알아냄 - 경로 압축에 사용
    }
    private static boolean union(int x, int y) { // 랭크를 이용한 union으로 x가 속한 집합과 y가 속한 집합을 합침
        int x_root = findSet(x);
        int y_root = findSet(y);
        if(x_root > y_root) { // x 루트노드의 랭크가 y의 루트노드보다 크면.
            parent[x_root] = y_root; // x의 루트노드를 y의 루트노드로 만듦.
            return true;
        }
        else if(x_root < y_root){ // x 루트노드의 랭크가 y의 루트노드보다 작으면.
            parent[y_root] = x_root; // y의 루트노드를 x의 루트노드로 만듦.
            return true;
        }
        else{ // 루트 노드가 같으면 합칠 필요가 없음.
            return false;
        }

    }
}
