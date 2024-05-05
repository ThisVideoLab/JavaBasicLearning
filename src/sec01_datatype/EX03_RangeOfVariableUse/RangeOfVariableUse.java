package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		/* 변수의 생존 기간
		 
		 	변수의 생존 기간은 메모리에 변수가 만들어진 이후 사라지기 까지의 기간을 의미함. 자바에서는 개발자가 직접 변수를
		 	생성하는데, 메모리에서 변수를 삭제하는 작업은 자바 가상 머신이 알아서 실행함.
		 
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
