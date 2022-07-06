
public class Operator1 {

	public static void main(String[] args) {
		int count=0;
		count += 1; // 1
		count += 1; // 2
		
		count = 0;
		++count;
		count++;
		
		
		System.out.println(++count); //3
		System.out.println(count++); //3
		System.out.println(count); //4
		
		count = 0;
		
		int result = ++count;
		System.out.println(count + " " + result); // count 1 , result 1
		
		result = count++;
		System.out.println(count + " " + result); // count 2 , result 1
	}
}