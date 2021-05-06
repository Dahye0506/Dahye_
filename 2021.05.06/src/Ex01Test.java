import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//02번
		
		Map<String, Account> map = new HashMap<String, Account>(); //08번
		
		
		
		while(true) { //06번
			//들여쓴 후 while문
			System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌정보 : 4 | 프로그램종료 : 5 "); //작업순서 : 01번
			System.out.println("해당번호를 입력하세요 : ");//02번
			
			String num = sc.nextLine();//03번
			switch(num) { //04번
			case "1" :
				System.out.println("==========");
				System.out.println("계좌등록 페이지입니다."); //05번
				
				System.out.print("계좌번호를 입력하세요. : "); //07번
				String accNum = sc.nextLine(); //07번
				System.out.print("계좌 주를 입력해주세요. : "); //07번
				String accName = sc.nextLine(); //07번
				System.out.print("입금 금액을 입력해주세요. : "); //07번
				int money = sc.nextInt(); sc.nextLine(); //07번
				//객체 생성
				Account acc = new Account(accNum, accName, money); //07번
				map.put(accNum,acc); //09번
				
				break;//브레이크 걸기
			case "2" :
				System.out.println("==========");
				System.out.println("입금 페이지입니다."); //05번
				
				//11번
				System.out.println("입금 계좌를 입력해주세요.");
				accNum = sc.nextLine();
				System.out.println("입금 금액을 입력해주세요.");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);//입금계좌 받아오기
				acc.setDeposit(money);// 입금 금액 더하기
				//11번끝
				break;
			case "3" :
				System.out.println("==========");
				System.out.println("출금 페이지입니다."); //05번
				//11번
				System.out.print("출금 계좌를 입력해주세요. :");
				accNum = sc.nextLine();
				System.out.println("출금 금액을 입력해주세요.");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);//계좌 받아오기
				acc.setWithdraw(money);// 출금 금액 받아오기
				//11번 끝
				
				break;
			case "4" :
				System.out.println("==========");
				System.out.println("계좌 정보 출력"); //05번
				//10번
				System.out.println("계좌번호 \t 계좌주 \t 금액");
				for(String key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();//출력값
				}
				//10번 끝
				break;
			case "5" :
				System.out.println("==========");
				System.out.println("프로그램 종료하겠습니다."); //05번
				System.exit(0);
				
			default :
				System.out.println("입력값이 잘못되었습니다."); //05번
			}
		}
		

	}

}
