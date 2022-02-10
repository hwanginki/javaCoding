package recursiveTreeGraphDFS_BFS;

/*
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용
해서 출력해야 합니다.

▣ 입력설명
첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.

▣ 출력설명
첫 번째 줄에 이진수를 출력하세요.

▣ 입력예제 1
11

▣ 출력예제 1
1011
 */
public class 재귀함수로이진수출력 {
	
	public void DFS(int n) {
		if (n == 0) {
			return;
		} else {
			DFS(n / 2);
			System.out.println(n % 2);
		}
	}
	
	public void solution(int n) {
		DFS(n);
	}
	
	public static void main(String[] args) {
		재귀함수로이진수출력 T = new 재귀함수로이진수출력();
		T.solution(11);
	}
	
}
