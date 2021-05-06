package package02;

public class Ex04Test {

	public static void main(String[] args) {
		String s1 = "123";
		//int i = s1; //기본자료형은 사용 불가
		// 아래 Warrper로 사용 해야함
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = new Integer(s1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		String s2 = "10.5";
		//Integer i3 = Integer.parseInt(s2);
		//10.5는 실수형 이라서 변환 불가
		//System.out.println(i3); //출력시 오류
		
		
		int i4 = 123;
		if(i4 == i1) { //i4는 기본자료형으로 equals 메서드 사용불가
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(i1.equals(i4)) {//i1은 wapper자료형, equals 메서드 사용하여 비교 가능
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		//integer의 최대,최소 값 == -2147483647 ~ +2147483647
		System.out.println("MAX 값 : " + Integer.MAX_VALUE);
		System.out.println("MIN 값 : " + Integer.MIN_VALUE);
		

	}

}
