package stackqueue;

import java.util.*;
import java.io.*; // 입출력 관련 라이브러리 임포트

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
			q.offer(new Person(i, arr[i]));
		}
		
		
		System.out.println(">>>>>>>>" + q.size());
		
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for (Person x : q) {
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
