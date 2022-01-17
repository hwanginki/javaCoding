package codingTestMethodStudy;

/*
 * String 메서드 1. String toUpperCase() : 문자열을 대문자로 변경
 * ＠toUpperCase().replaceAll(String regex, String replacement) 2. String
 * toLowerCase() : 문자열을 소문자로 변경 3. char[] toCharArray() 4. String next() 5.
 * StringBuilder StringBuilder(String str) 6. String[] split(String regex) 7.
 * int indexOf(int ch) 8. StringBuilder reverse() : AbstractStringBuilder 클래스 상속
 * 9. boolean equalsIgnoreCase(String anotherString) : 대소문자 구분 X 10. boolean
 * equals(Object anObject) : 대소문자 구분 O 11. String replaceAll(String
 * regex(정규표현식), String replacement(교체)) 12. String replace(char oldChar, char
 * newChar) 13. boolean isDigit(char ch) 14. String substring(int beginIndex) :
 * beginIndex부터 위치자리에서 잘라서 출력하는 메서드 15. String substring(int beginIndex, int
 * endIndex) : beginIndex부터 endIndex까지 출력하는 메서드 16. int parseInt(String s) :
 * 문자열을 숫자로 변환 17. int parseInt(String s, int radix) : 진수(radix)로 Integer형으로 변환
 * 
 * 그리고 순수히 뒤집어하는 메서드 만들어보자! Character.toUpperCase(x); String Strubg
 * valueOf(Object, char, int..) Character boolean isDigit(char ch) Integer int
 * parseInt(String s) throws NumberFormatException : 숫자로 된 문자열을 int형 타입으로 바꾸는
 * 메서드
 * 
 * String name = "asd123"; String answer = "";
 * 
 * char[] aaa = name.toCharArray();
 * 
 * for (int i = 0; i < aaa.length; i++) { if (Character.isDigit(aaa[i])) {
 * answer += aaa[i]; } }
 * 
 * Integer zz = Integer.valueOf(answer);
 * System.out.println(answer.getClass().getName());
 * System.out.println(zz.getClass().getName());
 * 
 * for (int i = s.length() - 1; i >= 0; i--)
 * 
 * 18. retainAll() : Arraylist의 교집합 메서드
 * 
 * 19. if (n % cnt == 0) { answer++; } : 이 로직은 이해하고 보충할 것 또는 /의 차이점을 배우기!
 * 
 * 20. HashMap<V, K>의 getOrDefault() : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는
 * 메서드
 * 
 * @Override public V getOrDefault(Object key, V defaultValue)
 * 
 * getOrDefault의 사용법
 * 
 * import java.util.HashMap;
 * 
 * public class MapGetOrDefaultEx {
 * 		public static void main(String arg[]) {
 * 			String [] alphabet = { "A", "B", "C" ,"A"};
 * 			HashMap<String, Integer> hm = new HashMap<>();
 * 				for(String key : alphabet)
 * 					hm.put(key, hm.getOrDefault(key, 0) + 1);
 * 			System.out.println("결과 : " + hm);
 * 
 * // 결과 : {A=2, B=1, C=1} } }
 * 
 * 21. Integer.MIN_VALUE : 
 * 
 * 22. HashMap의 keySet() : Key의 값만 출력
 * 
 * 23. HashMap의 entrySet() : Key와 Value의 값 모두 출력
 * 
 * 24. Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽는다
 * 
 * 25. HashMap : 1. 배열과 연결이 결합된 형태 2. Hashing 기법을 사용하기 때문에 많은 양의 데이터가 저장할 때 유용함.
 * 3. 검색에 최고 성능 가진다. 4. 추가/삭제/검색/접근성이 모두 뛰어남
 * 4. 순서가 유지 보장이 없음.(다만, 순서 유지가 필요하다면 LinkedHashMap 가능)
 * 
 * Map<String, String> map = new HashMap<String, String>();
        map.put("key01", "value01");
        map.put("key02", "value02");
        map.put("key03", "value03");
        map.put("key04", "value04");
        map.put("key05", "value05");
 
        // 방법 01 : entrySet()
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        }
        
        // 방법 02 : keySet()
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
    
        // 방법 03 : entrySet().iterator()
        Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
        while (iteratorE.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
    
        // 방법 04 : keySet().iterator()
        Iterator<String> iteratorK = map.keySet().iterator();
        while (iteratorK.hasNext()) {
            String key = iteratorK.next();
            String value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
 * 
 * 
 */