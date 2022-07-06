import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=0; String result=""; int price;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		result = age>=10 && age<20 ? "10대" : "10대 아님";
		System.out.println(result);
		
		System.out.print("물건의 가격을 입력하세요 : ");
		price = sc.nextInt();
		
		price = (int) (price >= 30000 ? price : price*1.1);
		System.out.println("최종 금액은 " + price + "원 입니다");
		
		sc.close();
	}
}