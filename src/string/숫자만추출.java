package string;

import java.util.*;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고
 * 이것을 자연수를 만들면 1205 이 됩니다. 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * ▣ 입력설명 첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * ▣ 출력설명 첫 줄에 자연수를 출력합니다.
 * ▣ 입력예제 1 g0en2T0s8eSoft
 * ▣ 출력예제 1 208
 */
public class 숫자만추출 {
	public int solution(String s) {
		String answer = "";

		for (char x : s.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		숫자만추출 T = new 숫자만추출();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}