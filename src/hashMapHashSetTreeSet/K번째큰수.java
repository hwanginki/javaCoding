package hashMapHashSetTreeSet;

import java.util.*;

/*
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가
여러장 있을 수 있습니다. 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다.
3장을 뽑을 수 있는 모든 경우를 기록합니다. 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.

▣ 입력설명
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.

▣ 출력설명
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.

▣ 입력예제 1
10 3
13 15 34 23 45 65 33 11 26 42

▣ 출력예제 1
143
 */
public class K번째큰수 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		// TreeSet : HashSet과 마찬가지로 Set 인터페이스를 구현한 클래스로써 객체를
		// 중복해서 저장할 수 없고 저장 순서가 유지되지 않는다는 Set의 성질을 그대로 가지고 있다.
		// HashSet과는 달리 TreeSet은 이진 탐색 트리(BinarySearchTree) 구조로 이루어져 있습니다.
		// 이진 탐색 트리는 추가와 삭제에는 시간이 조금 더 걸리지만, 정렬, 검색에 높은 성능을
		// 보이는 자료구조. 데이터의 추가와 삭제는 시간이 걸리지만, 정렬, 검색에는 유리함
		
		// Collections.reverseOrder() : 배열을 내림차순으로 정렬하는 메서드
		TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					Test.add(arr[i] + arr[j] + arr[j2]);
				}
			}
		}
		
		int cnt = 0;
		for (int x : Test) {
			cnt++; // 1씩 추가
			if (cnt == k) { // cnt가 k 같으면 x로 리턴
				return x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		K번째큰수 T = new K번째큰수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
