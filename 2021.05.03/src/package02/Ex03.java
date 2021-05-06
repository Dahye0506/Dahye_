package package02;

public class Ex03 {

	public static void main(String[] args) {
		// byte, char, short, int long , float, double, boolen
		// 기본 자료형에서 정수를 문자열로, 실수나 부울타입을 문자열로 변환 XXX
		// 문자열을 기본 자료형으로 변환x
		// 기본 자료형을 문자열로 변환하고 문자열을 기본자료형으로 변환이
		// 가능하게 하기 위한 자료형이 Wrapper 자료형이다.
		
		int i = 10;
		//String = i; //기본자료형에서는 사용 불가
		Integer i1 = 10; //Warpper 자료형
		
		short s =10;
		Short s1 = 10; //Warpper 자료형
		
		byte b = 10;
		Byte b1 = 12; //Warpper 자료형
		
		long l = 10L;
		Long l1 = 10L; //Warpper 자료형
		
		float f = 10.5f;
		Float f1 = 10.5f; //Warpper 자료형
		
		double d = 10.5;
		Double d1 = 10.5; //Warpper 자료형
		
		Boolean b2 = true;
		boolean b3 = true; //Warpper 자료형
		
		Integer i2 = 100; // 박싱
		int i3 = i2; // 언박싱
		
		
		//i3 = null;//기본자료형에는 null 값 저장 XX;
		// Warpper 자료형에는 null값 지정가능
		i2 = null;
		// Warpper 자료형은 null값을 저장하기 위해서 사용한다.
		// 문자열을 기본 자료형으로 변환하기 위해서 사용
		
		
		
		

	}

}
