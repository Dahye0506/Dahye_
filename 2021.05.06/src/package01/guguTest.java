package package01;

import java.util.Scanner;

public class guguTest {

	public static void main(String[] args) {
		gugu_1 ex = new gugu_1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력하세요.");
		int dan1 = sc.nextInt();
		
		System.out.println("끝 단을 입력하세요.");
		int dan2 = sc.nextInt();
		
		System.out.println("시작 곱을 입력하세요");
		int gop1 = sc.nextInt();
		
		System.out.println("끝 곱을 입력하세요.");
		int gop2 = sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);

	}

}
