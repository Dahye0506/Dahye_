package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//int com1 = (int)(Math.random()*3) + 1;//숫자 3개를 랜덤으로 출력 //+1 한 이유는 1부터 3까지 필요하기 때문
		Random rnd = new Random(10);
		int com1 = rnd.nextInt(3)+1;
		
		System.out.println("가위 바위 보 게임 시작");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		int saram = sc.nextInt();

		switch(com1) {
		case 1:
			switch(saram) {
			case 1: System.out.println("비겼습니다."); break;
			case 2: System.out.println("사람이 이겼습니다."); break;
			case 3: System.out.println("사람이 졌습니다."); break;
			}
			break;
		case 2:
			switch(saram) {
			case 1: System.out.println("사람이 졌습니다."); break;
			case 2: System.out.println("비겼습니다."); break;
			case 3: System.out.println("사람이 이겼습니다."); break;
			}
			break;
		case 3:
			switch(saram) {
			case 1: System.out.println("사람이 이겼습니다."); break;
			case 2: System.out.println("사람이 졌습니다."); break;
			case 3: System.out.println("비겼습니다."); break;
			}
			break;
		}
		
		
		
	}

}
