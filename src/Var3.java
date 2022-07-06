import java.util.Scanner;

public class Var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		int gion=0;		double cheon; String name;
		System.out.println("현재 온도를 입력하세요");
		gion = sc.nextInt();
		System.out.print("현재 온도는 : ");
		System.out.println(gion);
					

		System.out.println("현재 체온을 입력하세요");
		cheon = sc.nextDouble();
		System.out.println("현재 체온은 " + cheon + "도 입니다.");
		
		
		System.out.println("이름을 입력하세요");
		name = sc.next(); // nextLine()
		System.out.println("이름은 : " + name);
		System.out.println("Finish");
		
		
		sc.close();
	}
}