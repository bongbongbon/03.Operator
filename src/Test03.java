import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//다항연산자 또는 이항연산자를 이용해서 문제 풀어보기.
		//Scanner 이용해보기.

		//콘솔창을 통해서 입력받아온 String 데이터를 int로 바꾼후 해당 숫자가 짝수인지 또는 홀수인지를 판단하여 
		//콘솔창에 출력하세요. 1=>홀수 , 2=>짝수....
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		//Method (메소드) == 미리 만들어놓은 기능을 호출해서 사용한다 ==?
		//sc.nextLine() 하고 나서 결과는 항상 String ==sc.nextLine ==String
		System.out.println("숫자를 입력해주세요. 숫자 외에 값은 오류가 발생합니다.");
		System.out.println(Integer.parseInt(sc.nextLine() ) % 2 == 1 ? "홀수" : "짝수");
		
		
		//콘솔창을 통해서 String 데이터를 (숫자) 두개 입력 받는다.
		// 각각의 숫자는 num1 과 num2로 구분한다.
		// 두숫자의 더하기 ,  빼기 , 곱하기 , 나누기 한 결과를 출력하기.

		int num1 = Integer.parseInt(sc.nextLine() ); //enterkey 입력 시 입력 된 데이터를 바로 숫자로 바꾸고 int에 할당.
		int num2 = Integer.parseInt(sc.nextLine() );
		System.out.println("num1 + num2 =" +(num1 + num2));		
		System.out.println("num1 - num2 =" +(num1 - num2));
		System.out.println("num1 * num2 =" +(num1 * num2));
		System.out.println("num1 / num2 =" +(num1 / num2));
		
		//두숫자 중 더 큰숫자가 어떤 숫자인지 표시하기.
		String result = num1  == num2 ? "같음" : num1 < num2 ? "num2가 큼" : "num1 큼";
		System.out.println(result);
		
		
		

		
		
	
	}
}
