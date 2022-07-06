
public class Var99 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		//편의점 계산 자동화
		int price = 13250;
		int money = 50000;
		int jandon = money - price; // 15500
		int man=0; int chon=0; int back=0; int sib=0;
		
		man = jandon/10000;
		jandon -= man*10000;
		
		chon = jandon/1000;
		jandon -= chon*1000;
		
		back = jandon/100;
		jandon -= back*100;
		
		sib = jandon/10;
		jandon -= sib*10;
		
		System.out.println("잔돈은 10000원권 " + man + "장, 1000원권 " + chon
				+ "장, 100원 동전 " + back + "개, 10원 동전 " + sib + "개 입니다.");
		
		System.out.println("Finish");
	}
}