package stackqueue;

import java.util.*;

/*
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

▣ 입력설명
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

▣ 출력설명
남은 문자만 출력한다.

▣ 입력예제 1 (A(BC)D)EF(G(H)(IJ)K)LM(N)

▣ 출력예제 1 EFLM
 */
public class 괄호문자제거 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == ')') { // c == ')'가 이면
				// '('가 아닐 때까지 pop()으로 뺀다.
				while (stack.pop() != '(')
					;
			} else {
				stack.push(c);
			}
		}
		// 출력하는 부분
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		괄호문자제거 T = new 괄호문자제거();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
