package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		
		//아이디
		Map<String, Student> map = new HashMap<String, Student>();
		
		//로그인 프로그램
								// 비밀번호, 이름
		Student std = new Student("123","이다혜");
		map.put("Id-1",std);

		std = new Student("456","임성철");
		map.put("Id-2",std);
		
		std = new Student("789","자바는");
		map.put("Id-3",std);
		
		std = new Student("012","어려움");
		map.put("Id-4",std);
		

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			//map에 키가 존재하는지 확인
			//System.out.println(map.containsKey("Id-5")); //키값이 존재하면 true, 없다면 false
			
			if(map.containsKey(id)) {
				Student std1 = map.get(id);
				if(std1.sno.equals(password)) {
					//id == password도 같다면
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 없습니다.");
			}
			
		}
		
		
		
		
		

	}

}
