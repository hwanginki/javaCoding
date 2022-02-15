package recursiveTreeGraphDFS_BFS;

import java.util.*;

/*
고난도 문제이므로 계속 이해하고 계속 풀어볼 것!

방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.

아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는

1 2 3 4 5
1 2 5
1 3 4 2 5
1 3 4 5
1 4 2 5
1 4 5

총 6 가지입니다.

▣ 입력설명
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

▣ 출력설명
총 가지수를 출력한다.

▣ 입력예제 1
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

▣ 출력예제 1
6
 */
public class 경로탐색_인접행렬 {
	
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;

	public void DFS(int v) {
		if (v == n)
			answer++;
		else {
			for (int i = 1; i <= n; i++) {
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		경로탐색_인접행렬 T = new 경로탐색_인접행렬();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
	
	
}
