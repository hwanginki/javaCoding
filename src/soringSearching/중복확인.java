package soringSearching;

import java.util.*;

/*
현수네 반에는 N명의 학생들이 있습니다.
선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나
적어 내라고 했습니다.
만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고, N
명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

▣ 입력설명
첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.

▣ 출력설명
첫 번째 줄에 D 또는 U를 출력한다.

▣ 입력예제 1
8
20 25 52 30 39 33 43 33

▣ 출력예제 1
D
 */
public class 중복확인 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				answer = "D";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		중복확인 T = new 중복확인();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
	
	
}
