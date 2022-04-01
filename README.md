# java 코딩테스트 대비용 메서드 학습하기!

String 메서드
1. String toUpperCase() : 문자열을 대문자로 변경 ＠toUpperCase().replaceAll(String regex, String replacement)
2. String toLowerCase() : 문자열을 소문자로 변경
3. char[] toCharArray()
4. String next()
5. StringBuilder StringBuilder(String str)
6. String[] split(String regex)
7. int indexOf(int ch)
8. StringBuilder reverse() : AbstractStringBuilder 클래스 상속
9. boolean equalsIgnoreCase(String anotherString) : 대소문자 구분 X
10. boolean equals(Object anObject) : 대소문자 구분 O
11. String replaceAll(String regex(정규표현식), String replacement(교체)) 
12. String replace(char oldChar, char newChar)
13. boolean isDigit(char ch)
14. String substring(int beginIndex) : beginIndex부터 위치자리에서 잘라서 출력하는 메서드 
15. String substring(int beginIndex, int endIndex) : beginIndex부터 endIndex까지 출력하는 메서드
16. int parseInt(String s) : 문자열을 숫자로 변환
17. int parseInt(String s, int radix) : 진수(radix)로 Integer형으로 변환

그리고 순수히 뒤집어하는 메서드 만들어보자!
Character.toUpperCase(x);
String Strubg valueOf(Object, char, int..)
Character boolean isDigit(char ch)
Integer int parseInt(String s) throws NumberFormatException : 숫자로 된 문자열을 int형 타입으로 바꾸는 메서드

String name = "asd123";
String answer = "";

char[] aaa = name.toCharArray();
		
for (int i = 0; i < aaa.length; i++) {
	if (Character.isDigit(aaa[i])) {
		answer += aaa[i];
	}
}
		
Integer zz = Integer.valueOf(answer);
System.out.println(answer.getClass().getName());
System.out.println(zz.getClass().getName());

for (int i = s.length() - 1; i >= 0; i--)

18. boolean retainAll(Collection<?> c) : Arraylist의 교집합 메서드

Collection

![java_Collection](https://user-images.githubusercontent.com/60806047/151949808-8d8efd4b-adc9-4bde-bdf2-1712bc0b763b.JPG)

19. LinkedList


19. Queue 개념 확실히 알 것~!
- 큐(Queue)는 리스트의 한쪽에서는 삽입 작업이 이루어지고 다른 한쪽에서는 삭제 작업이 이루어지도록 구성한 자료 구조이다.
- 큐는 가장 먼저 삽입된 자료가 가장 먼저 삭제되는 선입선출(FIFO; First In First Out) 방식으로 처리한다.
- 큐는 시작과 끝을 표시하는 두 개의 포인터가 있다.
- 큐는 운영체제의 작업 스케줄링에 사용한다.															

20. 배열[]의 clone() : protected native Object clone() throws CloneNotSupportedException;

21. Arrays.stream(arr).max().getAsInt()

22. Arrays.sort(arr, Collections.reverseOrder()) : 배열을 내림차순으로 정렬하는 메서드

22. Collections.sort(Object o)
Character
- boolean isUpperCase(char ch) : 대문자 판단
- boolean isLowerCase(char ch) : 소문자 판단

23. https://coding-factory.tistory.com/534
- indexOf() ,contains(), matches()의 메소드의 사용용도 : 문자열에 특정 문자(문자열)를 포함해서 찾기

24. 
// https://godog.tistory.com/entry/Java-DecimalFormat-%EC%B2%9C%EB%8B%A8%EC%9C%84%EB%A7%88%EB%8B%A4-%EC%89%BC%ED%91%9C-%EC%9E%85%EB%A0%A5
// https://coding-factory.tistory.com/734
- 천단위 메서드, BigInteger클래스 활용하는 메서드 


# 좋은 교육 사이트

https://www.baeldung.com/java-depth-first-search
