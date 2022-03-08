package dfs_bfs;

import java.util.*;

/*
      
nCr = n!/(n-r)!r로 계산합니다. 하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여
재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
          
▣ 입력설명
첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.

▣ 출력설명
첫째 줄에 조합수를 출력합니다.

▣ 입력예제 1
5 3

▣ 출력예제 1
10

▣ 입력예제 2
33 19

▣ 출력예제 2
818809200
 */
public class 조합의경우수_메모이제이션 {
	
	int[][] dy = new int[35][35];

	public int DFS(int n, int r) {
		if (dy[r][r] > 0) {
			return dy[n][r];
		}
		if (n == r || r == 0) {
			return 1;
		} else {
			return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
		}
	}
	
	public static void main(String[] args) {
		조합의경우수_메모이제이션 T = new 조합의경우수_메모이제이션();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		
		kb.close();
		
		System.out.println(T.DFS(n, r));
	}
}
