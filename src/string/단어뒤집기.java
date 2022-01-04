package string;

import java.util.*;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * ▣ 출력설명 N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * ▣ 입력예제 1 3 good Time Big
 * ▣ 출력예제 1 doog emiT giB
 */

// 방법1
public class 단어뒤집기 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		단어뒤집기 T = new 단어뒤집기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}

// 방법2
class 단어뒤집기2 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		단어뒤집기2 T = new 단어뒤집기2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}