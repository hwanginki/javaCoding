package javaCoding;

import java.util.*;

/**
 * 설명 : 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 
 * ▣ 입력설명 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * ▣ 출력설명 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * ▣ 입력예제 1 StuDY
 * ▣ 출력예제 1 sTUdy
 */
class 대소문자변환 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		// System.out.println(str+" "+t);
		/*
		 * for(int i=0; i<str.length(); i++){ if(str.charAt(i)==t) answer++; }
		 */
		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		대소문자변환 T = new 대소문자변환();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(str, c));
	}
}
