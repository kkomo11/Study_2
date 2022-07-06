import java.util.Scanner;

public class Var4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		String id; String password; String repass; String name; int year; int month; int day; String sex;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.println(id + "@naver.com");
		
		System.out.print("비밀번호 : ");
		password = sc.next();
		System.out.println(password);
		
		System.out.print("비밀번호 재확인 : ");
		repass = sc.next();
		System.out.println(repass);
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println(name);
		
		System.out.print("생년월일 : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		System.out.print("성별 : ");
		sex = sc.next();
		System.out.println(sex);
		
		System.out.println("Finish");
		sc.close();
	}
}