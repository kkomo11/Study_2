
public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 2.1234;
		float f1 = 2.1234f;
		float f2 = f1;
		System.out.print(d1 + " " + f1 + " " + f2);
		 
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = kor + math + eng;
		
		kor = 50;
		math = 50;
		eng = 50;
		System.out.println(total); //0
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = ' '; // char 타입의 초기값
		double d2 = 0.0; // 초기값
		float f3 = 0.0f; // 초기값
		
		
		boolean b1 = true;
		boolean b2 = false; // 초기값
		
		String name = "abc";
		String name2 = new String();
		
		System.out.println('b'); // char
		System.out.println('1');	// char
		System.out.println("abc"); // String
		System.out.println(c2 + "" + d2 + "" + f3 + b1 + b2 + name + name2); 
	}
}