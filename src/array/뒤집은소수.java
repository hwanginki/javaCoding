package array;

import java.util.*;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 * ▣ 입력설명 첫 줄에 자연수의 개수 N(3 <= N <= 100)이 주어지고,
 * 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다.
 * ▣ 출력설명 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * ▣ 입력예제 1 9 32 55 62 20 250 370 200 30 100
 * ▣ 출력예제 1 23 2 73 2 3
 */
public class 뒤집은소수 {
	public boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	 
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while (tmp > 0) {
				System.out.println(i);
				// 32 % 10 = 2
				int t = tmp % 10;
//				System.out.println("1_>>>" + t);
				res = res * 10 + t;
//				System.out.println("2_>>>" + res);
				// 32 / 10 = 3, 910 / 10 = 91, 20 /10 = 2
				tmp = tmp / 10;
//				System.out.println("3_>>>" + tmp);
			}
			if (isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		뒤집은소수 T = new 뒤집은소수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
