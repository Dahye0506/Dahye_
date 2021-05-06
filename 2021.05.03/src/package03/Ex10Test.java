package package03;

public class Ex10Test {
	public static void main(String[] args) {
		//Math.random() 활용
		double num = Math.random();
		//math값 = 0.000000000000 ~ 0.99999999999999
		System.out.println(num); // 0.랜덤출력
		
		int num1 = (int)Math.random(); //정수로 형변환
		int num2 = (int)(0.25);
		int num3 = (int)(1.65);

		System.out.println("num2 " +num2);
		System.out.println("num3 " +num3);
		System.out.println(num);
		System.out.println(num1);

		
		
	}
}
