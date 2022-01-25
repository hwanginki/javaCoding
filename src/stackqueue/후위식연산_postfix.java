package stackqueue;

import java.util.*;

/*
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

▣ 입력설명
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

▣ 출력설명
연산한 결과를 출력합니다.

▣ 입력예제 1 352+*9-

▣ 출력예제 1 12
 */
public class 후위식연산_postfix {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push(x - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+') stack.push(lt + rt);
				else if (x == '-')	stack.push(lt - rt);
				else if (x == '*')	stack.push(lt * rt);
				else if (x == '/')	stack.push(lt / rt);
			}
		}
		answer = stack.get(0);
		return answer;
	}

	public static void main(String[] args) {
		후위식연산_postfix T = new 후위식연산_postfix();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}