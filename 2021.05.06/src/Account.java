
public class Account {
	String accNum;
	String accName;
	int balance;
	
	//생성자
	public Account(String accNum, String accName, int balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	//내용을 수정하지 않기때문에 세터,게터를 만들필요없다.
	//금액만 수정하기때문에 만든다.
	
	//입금
	public void setDeposit(int money) {
		this.balance = this.balance + money;
		//Deposit 입금
	}
	
	//출금
	public void setWithdraw(int money) {
		this.balance = this.balance - money;
		//Withdraw 출금
	}
	
	//출력값
	public void print() {
		System.out.println(accNum + "\t" + accName + "\t" + balance);
	}
	
	

}
