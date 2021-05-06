package package01;

import java.util.Scanner;

public class 이다혜_Test {
	public static void main(String[] args) {
		이다혜_1 ex = new 이다혜_1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력하세요 : ");
		int dan1 = sc.nextInt();
		System.out.print("끝 단을 입력하세요. : ");
		int dan2 = sc.nextInt();
		System.out.print("시작 곱을 입력하세요 : ");
		int gop1 = sc.nextInt();
		System.out.print("끝 곱을 입력하세요 : ");
		int gop2 = sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);

	}

}
