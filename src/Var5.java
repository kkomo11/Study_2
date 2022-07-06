import java.util.Scanner;

public class Var5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0, total=0;
		
		System.out.print("숫자 5개를 입력해주세요 : ");
		num = sc.nextInt(); total += num;
		num = sc.nextInt(); total += num;
		num = sc.nextInt(); total += num;
		num = sc.nextInt(); total += num;
		num = sc.nextInt(); total += num;
		
		System.out.println("총합 : " + total);
		
		Scanner sc2 = new Scanner(System.in);
		int[] num3 = new int[6];
		System.out.print("숫자 5개를 입력해주세요 : ");
		num3[0] = sc2.nextInt();
		num3[1] = sc2.nextInt();
		num3[2] = sc2.nextInt();
		num3[3] = sc2.nextInt();
		num3[4] = sc2.nextInt();
		num3[5] = num3[0] + num3[1] + num3[2] + num3[3] + num3[4];
		System.out.println("총합 : " + num3[5]);
		
		sc.close();
		sc2.close();
	}
}