import java.util.Scanner;

public class Var9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1= 97; long num2 = 10L;
		System.out.println(num1 == num2);
		
		char ch = 'a';
		String name1 = "iu";
		String name2 = "iu";
		System.out.println(ch == num1);
		System.out.println(name1 == name2);
		
		System.out.print("이름을 입력 : ");
		String name3 = sc.next();
		System.out.println(name1 == name3);
		
		int age = 20; boolean check = age >= 10 && age <20;
		System.out.println(check);
		sc.close();
	}
}