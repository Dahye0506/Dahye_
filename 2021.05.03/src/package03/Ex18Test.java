package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex18Test {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "이다혜");
		map.put(2, "임성철");
		map.put(3, "자바");
		map.put(4, "개어려움");
		
		System.out.println(map.keySet());
		
		map.remove(3);//3키 값 삭제
		/*
		map.put(1, "이다혜");
		map.put(2, "임성철");
		map.put(4, "개어려움");
		*/
		
		System.out.println(map.keySet()); //1,2,4
		
		

	}

}
