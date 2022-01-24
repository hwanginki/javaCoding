package stackqueue;

import java.util.*;

/*
게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.
죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려
고 합니다.

게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인
이 있고 오른쪽에는 바구니가 있습니다. (위 그림은 5 x 5 크기의 예시입니다). 각 격자 칸에
는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다. 모든 인형은 1 x 1 크기의 격자
한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다. 게임 사용자는 크레인을
좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 집어 올린 인
형은 바구니에 쌓이게 되는 데, 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩
니다. 다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습
입니다.

▣ 입력설명
첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
두 번째 줄부터 N*N board 배열이 주어집니다.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나
타냅니다.
board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
마지막 줄에는 moves 배열이 주어집니다.
moves 배열의 크기는 1 이상 1,000 이하입니다.
moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.

▣ 출력설명
첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.

▣ 입력예제 1
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

▣ 출력예제 1
4
 */
public class 크레인인형뽑기 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;
					// peek() : 최상단 값 확인
					if (!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						// pop() : 꺼내는 요소
						stack.pop();
					} else
						stack.push(tmp);
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		크레인인형뽑기 T = new 크레인인형뽑기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++)
			moves[i] = kb.nextInt();
		System.out.println(T.solution(board, moves));
	}
}
