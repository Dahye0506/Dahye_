package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex17Test {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<Integer, Board>();
		Board b = new Board("제목","제목","글쓴이");
		map.put(1, b);
		map.put(2, new Board("제목1","제목1","글쓴이1"));
		map.put(2, new Board("제목2","제목2","글쓴이2"));//키값이 중복되어 사용 불가
		System.out.println(map.size());//2
		map.put(3, new Board("제목2","제목2","글쓴이2"));
		
		
		//출력
		for(Integer i : map.keySet()) {
			Board bd = map.get(i);
		//  Board 인 이유는 보드로 받아왔기때문
			System.out.println(bd.content);
			System.out.println(bd.subject);
			System.out.println(bd.writer);
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "이다혜");
		map1.put(2, "임성철");
		map1.put(3, "멍청이");
		for(Integer i : map1 .keySet()) {
			String str1 = map1.get(i);
		//  String인 이유는 map1은 스트링으로 받아왔기때문
			System.out.println(str1);
		}
		
		
		

	}

}
