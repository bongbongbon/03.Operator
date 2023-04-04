
public class Ex02_Operator {
	public static void main(String[] args) {
		//※복습해도됨. 엄청 많이씀 , 증감 , 가감 =
		//++ , -- 
		// 현실에서 사용 x
		// ++ 현재 수 +1
		int num1 =1 , num2 =1;
		System.out.println(num1++);//후행연산 ( 뒤에 증감식이 붙은것)
		System.out.println(++num2);//선행연산 ( 앞에 증감식이 붙은것)
		
		System.out.println("증감식 후 : " + num1);
		System.out.println("증감식 후 : " + num2);
		
		System.out.println(num1);//2
		System.out.println(num2);//1
		
		int x =1;
		int y =1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1);//12
		System.out.println(result2);//11	
		System.out.println("증감식 후 : " + result1);
		System.out.println("증감식 후 : " + result2);
		
		
		
	}
}
