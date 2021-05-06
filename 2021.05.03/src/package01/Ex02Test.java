package package01;

import java.util.Scanner;

public class Ex02Test {
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		//스캐너 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력해주세요");
		int dan1 = sc.nextInt();
		System.out.print("끝 단을 입력해주세요");
		int dan2 = sc.nextInt();
		System.out.print("시작 곱을 입력해주세요");
		int gop1 = sc.nextInt();
		System.out.print("끝 곱을 입력해주세요");
		int gop2 = sc.nextInt();

		
		// int 지정
		/*
		int dan1 = 2;
		int dan2 = 5;
		int gop1 = 1;
		int gop2 = 9;
		*/
		ex.gugu(dan1, dan2, gop1, gop2);//곱 출력됨
		
		
		
		
	}
}
