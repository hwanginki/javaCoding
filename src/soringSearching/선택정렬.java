package soringSearching;

import java.util.*;

/*
N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 선택정렬입니다.

▣ 입력설명
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

▣ 출력설명
오름차순으로 정렬된 수열을 출력합니다.

▣ 입력예제 1
6
13 5 11 7 23 15

▣ 출력예제 1
5 7 11 13 15 23
 */
public class 선택정렬 {
	public int[] solution(int n, int[] arr) {
		// 방법 1
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			
			for (int j = i + 1; j < n; j++) {
				// < : 오름차순 : 1,2,3,4,5
				// > : 내림차순 : 5,4,3,2,1
				if (arr[j] < arr[idx])
					idx = j;
			}
			
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		// 방법 2
		// Arrays.sort(arr);
		
		return arr;
	}

	
	public static void main(String[] args) {
		선택정렬 T = new 선택정렬();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();
		for (int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}
