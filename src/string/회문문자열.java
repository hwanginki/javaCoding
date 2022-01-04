package string;

import java.util.*;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력 하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * ▣ 입력설명 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * ▣ 출력설명 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * ▣ 입력예제 1 gooG
 * ▣ 출력예제 1 YES
 */
// 방법_1
public class 회문문자열 {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				answer = "NO";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		회문문자열 T = new 회문문자열();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

// 방법_2
class Main {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				answer = "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}