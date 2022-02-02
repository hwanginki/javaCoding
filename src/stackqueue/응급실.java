package stackqueue;

import java.util.*;
import java.io.*; // 입출력 관련 라이브러리 임포트


/*
메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조
치를 의사가 해야 합니다. 이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의
진료순서를 정합니다.

• 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
• 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로

다시 넣습니다. 그렇지 않으면 진료를 받습니다.
즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
현재 N명의 환자가 대기목록에 있습니다.
N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료
를 받는지 출력하는 프로그램을 작성하세요.
대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.

▣ 입력설명
첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.

▣ 출력설명
M번째 환자의 몇 번째로 진료받는지 출력하세요.

▣ 입력예제 1 5 2 60 50 70 80 90

▣ 출력예제 1 3

▣ 입력예제 2 6 3 70 60 90 60 60 60

▣ 출력예제 2 4
 */
class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class 응급실 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i])); // offer 메서드 이용해 요소를 추가함
		}
		
		while (!q.isEmpty()) { // 요소가 비어지지 않을 때
			Person tmp = q.poll();
			for (Person x : q) {
				// x가 tmp보다 크면 tmp 요소 추가하고 tmp에 null로 대입
				if (x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				answer++;
				if (tmp.id == m)
					return answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		응급실 T = new 응급실();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}
