## Dijkstra 
### Shortest Path, Graph Theory, Priority Queue
### 최단 경로 탐색, 그래프 이론, 우선순위 큐
#### Common
- 매트릭스(지도) - (경로, 가중치)
- 큐 - (가중치, 경로)
  - 일치시켜도 무관, 직관성 측면에선 위가 무난
- 가중치는 가변적(누적값, 최대값, 최소값 etc)

<h4> <details><summary><a href="https://www.acmicpc.net/problem/20168">20168</a></summary>

- 핵심은 가중치/비교조건 설정
- `현재 정점에 연결된 모든 정점을 큐에 넣을 때 각각의 가중치 메모리 배열도 수정되고, 그 상태에서 우선순위에 따라 다음 반복이 진행`

</details> </h4>