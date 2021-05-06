package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 
		 map.put("이다혜", 25);
		 map.put("키", 30);
		 map.put("ㅇㅇ", 35);
		 
		 System.out.println("map의 크기 : "+ map.size());
		 System.out.println("데이터 출력 : "+ map.get("이다혜"));
		 
		 //map데이터 삭제
		 map.remove("ㅇㅇ");
		 
		 //출력
		 for(String str : map.keySet()) {
			 System.out.println(map.get(str));
		 }
		 
		 //map에 있는 데이터 수정
		 map.put("이다혜", 50);
		 //map은 중복키를 허용하지 않기 때문에 키가 같은 경우 값을 변경한다.
		 
		 //데이터 수정 후 출력하였더니 이다혜가 50으로 변경
		 for(String str : map.keySet()) {
			 System.out.println("변경 후 값 : "+map.get(str));
		 }
		 
		 //전체 삭제
		 map.clear();
		 System.out.println("map의 크기 : " + map.size());

	}

}

// map에서 사용하는 메서드 정리
// 데이터 저장 map.put(키,값); 중복 키를 허용하지 않는다.
// 데이터 수정 : map.put(키, 값) 키는 존재하는 '키' 이어야 한다.
// '키'만 가져올때 : KeySet();
// '값'을 가져올때 : get(키);
// 모든 데이터 삭제 : clear();
// 특정 값 삭제 : remove(키); , remove(키, 값)
// map의 크기 : size()
// 키의 존재 여부 확인 : containsKey();


