## Dijkstra 
* * *
> ### Shortest Path, Graph Theory, Priority Queue
> ### 최단 경로 탐색, 그래프 이론, 우선순위 큐
> #### Common
> - 매트릭스(지도) - (경로, 가중치)
> - 큐 - (가중치, 경로)
>   - 일치시켜도 무관, 직관성 측면에선 위가 무난
> - 가중치는 가변적(누적값, 최대값, 최소값 etc)
> 
> 
> <details><summary><a href="https://www.acmicpc.net/problem/20168" style="font-size:24px; font-weight:bold;" >20168</a></summary>
>
> - 핵심은 가중치/비교조건 설정
> - `현재 정점에 연결된 모든 정점을 큐에 넣을 때 각각의 가중치 메모리 배열도 수정되고, 그 상태에서 우선순위에 따라 다음 반복이 진행`
> </details>
>
> <details><summary><a href="https://www.acmicpc.net/problem/28707" style="font-size:24px; font-weight:bold;" >28707 <img src="https://static.solved.ac/tier_small/15.svg" width="30" height="20"> 배열 정렬</a></summary>
>
> ### _[source](./P28707.py)_ `Data Structure` / `Graph` / `Dijkstra` / `HashSet`
> 
> - 배열의 모든 상태를 하나의 노드로 판별
> - 배열의 상태를 변환하는 스왑 연산을 하나의 간선, 그 비용을 가중치로 판별
> - 시작(입력) 배열에서 도착(정렬된) 배열까지의 최소 비용 탐색
> - `작성된 풀이 발상은 간단하지만 그걸 어케 생각해내는데요`
</details>
