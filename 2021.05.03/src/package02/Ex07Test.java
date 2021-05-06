package package02;

public class Ex07Test {

	public static void main(String[] args) {
		// 박싱(Boxing)
		String str = "100";
		Integer i1 = Integer.parseInt(str);
		Integer i2 = new Integer(str);
		Integer i3 = Integer.valueOf(str);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("========================");
		//레퍼 자료형을 기본 자료형으로 변경하는것을 언박싱 이라 한다.
		//언박싱 (unboxing)
		int ii1 = i1;
		int ii2 = i1.intValue();
		System.out.println(ii1);
		System.out.println(ii2);
		
		
		String str1 = "true";
		Boolean b = Boolean.parseBoolean(str1);
		//문자를 boolean 타입으로 변경
		if(b) {
			System.out.println("부울타입으로 변환");
		}
		
		

	}

}
