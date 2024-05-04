package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		/* 변수의 생존 기간
		 
		 */
		int value1 = 3; // 변수 value1이 생성되는 시점
		{ 
			int value2 = 5; // 변수 value2가 생성되는 시점
			System.out.println(value1); // 변수가 살아 있으므로 문제 없이 출력
			System.out.println(value2); // 변수가 살아 있으므로 문제 없이 출력
		} // 변수 value2가 사라지는 시점
	
		System.out.println(value1); // 변수가 살아 있으므로 문제 없이 출력 
		//System.out.println(value2); // value2가 없으므로 오류가 발생함.
		
	} // 변수 value1이 사라지는 시점

}
