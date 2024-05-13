package sec01_array.EX03_InitialValue;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[]args) {
		
		/* 5.1.4 참조 변수와 배열 객체의 값 초기화하기
		   
		   앞에서 언급한 바와 같이 스택 메모리 변수를 초기화하지 않으면 메모리 공간은 텅 비어 있음. 이 상태에서는 해당 변수를 출력할 때
		   오류가 발생함. 기본자료형 변수이든, 참조 자료형 변수이든 모든 변수는 스택 메모리에 위치하고 있음. 따라서 모든 변수는 초기화 이후에만
		   출력이 가능함.
		   
		   초기화하지 않을 때의 초깃값
		   int a;
		   int []b;
		   // System.out.println(a); // 오류 발생
		   // System.out.println(b); // 오류 발생

		   기본 자료형 변수는 스택에 실제 데이터 값을 저장하므로 초깃값 역시 실제 데이터값(0, -1, false 등)을 저장함. 반면 참조 자료형 변수는
		   실제 데이터의 위치를 저장하므로 초깃값으로는 실제 데이터 값이 아닌 '가리키고 있는 위치가 없음'을 나타내는 null을 사용함. 정리하면
		   기본 자료형의 초깃값으로는 null을 사용하면 됨.
		   
		   기본 자료형과 참조 자료형의 초깃값
		   
		   int a = 0; // 기본 자료형
		   int [] b = null; // 참조 자료형
		   System.out.println(a); // 0 출력
		   System.out.println(b); // null 출력
		   
		   힙메모리에서의 강제 초깂값
		   
		   힙 메모리는 모든 공간에 값이 들어가 있어야 하며 초기화를 하지 않았을 때 자바 가상 머신이 강제 초기화를 함. 다음은 강제 초기화 값임.
		   불리언(boolean) - false
		   정수(byte, short/ char, int, long) - 0
		   실수(float, double)- 0.0
		   참조 자료형( 클래스, 배열 등등) - null
		   
		 */
		
		/*- 실습 - 스택 메모리의 초깃값과 참조 자료형의 강제 초깃갑*/
		System.out.println("- 실습 - 스택 메모리의 초깃값과 참조 자료형의 강제 초깃갑");
		
		/*스택 메모리값(강제 초기화되지 않음)*/ System.out.println("스택 메모리값(강제 초기화되지 않음)");
		
		int value1;
		// System.out.println(value1); // 오류 발생, 스택 메모리에 위치하는 변수는 초기화 없이 출력이 불가능함.
		
		int [] value2;
		// System.out.println(value2); // 오류 발생, 스택 메모리에 위치하는 변수는 초기화 없이 출력이 불가능함.
		
		int value3 = 0; // 0으로 초기화
		System.out.println(value3); // 0으로 출력
		
		int [] value4 = null; //null로 초기화
		System.out.println(value4); // null로 출력
		System.out.println();
		
		/*힙 메모리의 초깃값(강제 초기화)*/ System.out.println("힙 메모리의 초깃값(강제 초기화)");
		/*@기본 자료형 배열*/ System.out.println("@기본 자료형 배열");
		
		boolean [] array1 = new boolean[3]; // boolean 자료형의 초깃값인 false로 초기화
		for(int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " "); // false false false
		}
		System.out.println();
		
		int [] array2 = new int[3]; // int 자료형의 초깃값인 0으로 초기화
		for(int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " "); // 0 0 0
		}
		System.out.println();
		
		double [] array3 = new double[3]; // double 자료형의 초깃값인 0.0으로 초기화
		for(int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " "); //0.0 0.0 0.0
		}
		System.out.println();
		
		/*@참조 자료형 배열*/ System.out.println("@참조 자료형 배열");
		
		String[] array4 = new String[3]; // 참조 자료형의 초깃값인 null로 초기화
		for(int i = 0; i < 3; i++) {
			System.out.print(array4[i] + " "); // null null null
		}
		System.out.println();
		System.out.println();
		
		/*@참조 자료형 배열*/ System.out.println("@참조 자료형 배열");
		
		System.out.println(Arrays.toString(array1)); // Arrays 라고 하는 클래스를 통하면 array의 목록을 쉽게 출력 가능함.
		System.out.println(Arrays.toString(array2)); // 각 자료형에 상관 없이 모든 인덱스들을 출력함. 다만 여기서 출력할 때
		System.out.println(Arrays.toString(array3)); // 형태는 String의 형태로 출력된다는 점이 있음. 어렵게 for 문을 써서
		System.out.println(Arrays.toString(array4)); // 출력할 필요는 없음.
		
		
	}
	
}
