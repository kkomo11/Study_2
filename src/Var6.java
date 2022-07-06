
public class Var6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		int num1=10; long num2=20L;
		
//		num1 = num2
		System.out.println(20+20L);
		num1 = (int)num2; // 강제형변환
		num2 = num1; // 작은 타입 -> 큰 타입은 자동 형변환
		System.out.println(num1);
		
		char ch = 'b';
		num1 = ch;
		float f = num2;
		
		int k=35; int m=35; int e=37;
		int t = k+m+e;
		double v = t/3.0;
		System.out.println(t + " " + v);
		System.out.println(num1 + " " + f);
		System.out.println("Finish");
	}
}