package javaCoding;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * ▣ 입력설명 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성
 * 되어 있습니다.
 * ▣ 출력설명 첫 줄에 가장 긴 단어를 출력한다. 가장 긴 단어가 여러개일 경우 문장속에가 가장 앞쪽에 위
 * 치한 단어를 답으로 합니다.
 * ▣ 입력예제 1 it is time to study
 * ▣ 출력예제 1 study
 */
import java.util.*;

// 방법_1
class 문장속단어 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for (String x : s) {
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		문장속단어 T = new 문장속단어();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}

// 방법_2
class 문장속단어2 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > m)
			answer = str;
		return answer;
	}

	public static void main(String[] args) {
		문장속단어2 T = new 문장속단어2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}