import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//변수 선언
		int iNum1; // 선언 ( 어떤 이름을 사용하겠다고 .. ) 후 값을 안 넣어주면 사용x		
		iNum1 = 6; //할당 ( 값을 넣어줌 값 == 리터럴)
		double dNum = 13.0; //초기화 ( 선언과 동시에 할당 )
		double dNum2, dNum3 ; //..나열 ( 선언을 여러개를 동시에 함, 초기화 가능)
		
		String str = "문자열";
		
		//-- 캐스팅 --
		String numStr = "123";//
		int iNum2 = Integer.parseInt(numStr)+10;
		System.out.println(iNum2);
		String numStr2 = ""+iNum2;
		System.out.println(numStr2);
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println(str1);
	}
}
