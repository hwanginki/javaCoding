package dfs_bfs;

import java.util.*;

/*
7*7 격자판 미로를 탈출하는 최단경로의 길이를 출력하는 프로그램을 작성하세요. 경로의 길이는 출발점에서
도착점까지 가는데 이동한 횟수를 의미한다. 출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다.
격자판의 1은 벽이고, 0은 도로이다. 격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면

출발 0 0 0 0 0 0
   0 1 1 1 1 1 0
   0 0 0 1 0 0 0
   1 1 0 1 0 1 1
   1 1 0 1 0 0 0
   1 0 0 0 1 0 0
   1 0 1 0 0 0 도착

위와 같은 경로가 최단 경로의 길이는 12이다.

▣ 입력설명
첫 번째 줄부터 7*7 격자의 정보가 주어집니다.

▣ 출력설명
첫 번째 줄에 최단으로 움직인 칸의 수를 출력한다. 도착할 수 없으면 -1를 출력한다.

▣ 입력예제 1
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

▣ 출력예제 1
12
 */
class Point {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class 미로의최단거리통로_BFS {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] board, dis;
	
	public void BFS(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y));
		board[x][y] = 1;
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		미로의최단거리통로_BFS T = new 미로의최단거리통로_BFS();
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		T.BFS(1, 1);
		
		if (dis[7][7] == 0)
			System.out.println(-1);
		else
			System.out.println(dis[7][7]);
		
		kb.close();
	}
}
